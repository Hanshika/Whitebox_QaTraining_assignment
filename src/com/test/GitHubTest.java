package com.test;

import static org.testng.AssertJUnit.assertEquals;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utils.RestUtils;

public class GitHubTest extends BaseTest{
	
	RestUtils util;
	
	@BeforeClass
	public void beforeclass()
	{
		util =new RestUtils();
		util.getRequest("users/whiteboxhub");
	}
	@Test
	public void testHeaders()
	{
		
	}
	@Test
	
    
	public void testStatusCode()
			{
		
		assertEquals(HttpStatus.SC_OK,util.ValidateStatusCode());
			}
	@Test
		public void testLogin()
		{

	assertEquals("WhiteboxHub",util.getUser().getLogin());
	
		}
		@Test
		public void testgetUser()
		{
	
	assertEquals("4023110",util.getUser().getId());
	}
		@Test
		public void testgetblog(){
			assertEquals("http://www.whitebox-learning.com",util.getUser().getBlog());
		}
	}
