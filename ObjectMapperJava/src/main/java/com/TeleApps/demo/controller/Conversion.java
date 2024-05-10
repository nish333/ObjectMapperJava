package com.TeleApps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.TeleApps.demo.domain.MyObjects;

@RestController
@RequestMapping("/convert")
public class Conversion {
    
    String json = "[{\"name\":\"Nishanth\",\"age\":23,\"department\":\"CSE\",\"address\":\"Chennai\"},"
            + "{\"name\":\"Sankar\",\"age\":33,\"department\":\"EEE\",\"address\":\"Dubai\"},"
            + "{\"name\":\"Yuvi\",\"age\":13,\"department\":\"CIVIL\",\"address\":\"Thanjavur\"},"
            + "{\"name\":\"Hari\",\"age\":63,\"department\":\"ECE\",\"address\":\"Namakkal\"}]";
    
    @GetMapping("/data")
    public MyObjects[] convertObjects() throws JsonMappingException, JsonProcessingException 
    {
        ObjectMapper map = new ObjectMapper();
        MyObjects[] mo = map.readValue(json, MyObjects[].class);
        for (MyObjects val : mo) 
		{
		    System.out.println(val);
		}
		return mo;
    }
}
