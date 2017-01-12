package com.utils;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.util.EntityUtils;
import org.codehaus.jackson.map.ObjectMapper;

public class ResourceUtil {
	
	public static <X>X retrieveResource(HttpResponse response,Class<X> cl) {
	
		String json=null;
		
		try {
			json= EntityUtils.toString(response.getEntity());
		/*	int length=json.length()-1; //twitter string into array
			String json2=json.substring(1,length);*/
			
		//	json []byte= EntityUtils.toByteArray(response.getEntity());
			ObjectMapper mapper =new ObjectMapper();
			//ResourceUtil[] myObjects = mapper.readValue(json, ResourceUtil[].class);
		//	List<ResourceUtil> myObjects = Arrays.asList(mapper.readValue(json, ResourceUtil[].class));
			return mapper.readValue(json,cl);//change into json to json2
			
			//String arrayToJson = objectMapper.writeValueAsString(personList);
			
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}

}
	



