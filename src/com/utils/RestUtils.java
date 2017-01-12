package com.utils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.pojo.GitHubUser;
import com.pojo.twitter.MyPojo;
import com.pojo.twitter.User;

public class RestUtils 
{
	HttpUriRequest request;	
	HttpResponse response;
	private MyPojo twitteruser;
	String TWITTER_URI =Configuration.TWITTER_URI;
	String URI =Configuration.URI;
	
	
	
	public MyPojo getTwitteruser() {
		return twitteruser;
	}
	public void setTwitteruser(MyPojo twitteruser) {
		this.twitteruser = twitteruser;
	}
	private GitHubUser user;
	
	public GitHubUser getUser()
	{
		return user;
	}
	public void setUser(GitHubUser user) {
		this.user = user;
	}
	// TWITTER AUTHETICATION
	public void addAuthentication(){
		
		try{
			OAuthConsumer Consumer =new CommonsHttpOAuthConsumer(Configuration.CONSUMER_KEY,Configuration.CONSUMER_SECRET);
			Consumer.setTokenWithSecret(Configuration.TOKEN,Configuration.TOKEN_SECRET);
			Consumer.sign(request);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void getTwitterRequest(String resourceUrn,String screenname,int count){
		try{
			request =new HttpGet(TWITTER_URI+resourceUrn+"screen_name="+screenname+"&count="+count);
			request.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
			addAuthentication();
			this.response =HttpClientBuilder.create().build().execute(request);
			if(response!=null){
				 setTwitteruser(ResourceUtil.retrieveResource(response, MyPojo.class));
							}
			else{
				System.out.println("something went to wrong" +response);
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	//githubuser
	public void getRequest(String resourceUrn)
	{
	request =new HttpGet(URI+resourceUrn);	
		request.addHeader(HttpHeaders.CONTENT_TYPE,"application/json");
		try {
	this.response =HttpClientBuilder.create().build().execute(request);
 
	if(response !=null) // if you not getting blank response
	{
	setUser(ResourceUtil.retrieveResource(response,GitHubUser.class));
	}
	else{
	System.out.println("something went to wrong" +response);
	}
	
		} catch (ClientProtocolException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		}
	public int ValidateStatusCode()
	{
		return response.getStatusLine().getStatusCode();
	}

	 public String lang()
	{
	return getTwitteruser().getLang() ;
	}
	public void postRequest(String resourceUrn, String json) 
	{
	HttpPost req =new HttpPost(URI+resourceUrn);
	StringEntity entity;
	try {
		 User user =new User(); // creating obj and set obj
		 user.setId("q213214");
		
		ObjectMapper mapper =new ObjectMapper();
		try {
			json =mapper.writeValueAsString(user);
		} catch (JsonGenerationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonMappingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		entity =new StringEntity(json);
	req.setEntity(entity);
	try {
		this.response = HttpClientBuilder.create().build().execute(req);
	} catch (ClientProtocolException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	} catch (UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
 
}
