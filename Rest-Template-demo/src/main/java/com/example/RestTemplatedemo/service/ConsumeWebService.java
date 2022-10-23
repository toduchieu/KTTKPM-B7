package com.example.RestTemplatedemo.service;


import java.net.http.HttpHeaders;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

public class ConsumeWebService {
	
	   @Autowired
	   RestTemplate restTemplate;

	   @RequestMapping(value = "/template/chuyenbay")
	   public String getProductList() {
	      org.springframework.http.HttpHeaders headers= new org.springframework.http.HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);	      
	      return restTemplate.exchange(
	      		"http://localhost:4000/api/chuyenbay", HttpMethod.GET, entity, String.class).getBody();
	   }
}
