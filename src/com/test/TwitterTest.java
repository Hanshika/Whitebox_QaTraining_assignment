package com.test;
import static org.testng.AssertJUnit.assertEquals;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utils.RestUtils;

public class TwitterTest extends BaseTest{
RestUtils util;
@BeforeClass
public void beforeclass(){
	util =new RestUtils();
	util.getTwitterRequest("statuses/user_timeline.json?","yutstam",1);
}
@Test
public void testStatusCode(){
assertEquals(HttpStatus.SC_OK,util.ValidateStatusCode());
System.out.println(util.ValidateStatusCode());
	
}

/*@Test
public void idTest(){
	Assert.assertEquals("780975571505262592",util.id());
}
@Test
public void langtest(){
	assertEquals("fr",util.lang());
}*/
}
