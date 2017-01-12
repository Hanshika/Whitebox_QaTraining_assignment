package com.test;

import org.testng.annotations.BeforeClass;

import com.utils.RestUtils;

public class TwitterpostTest extends BaseTest {
RestUtils util;
@BeforeClass
public void beforeclass(){
	util =new RestUtils();
	util.postRequest("/statuses/retweet/:id.json","id:\"121321\",name:\"sadadsds\"");
}
}
