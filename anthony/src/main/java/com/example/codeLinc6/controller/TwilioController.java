package com.example.codeLinc6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeLinc6.mapperManager.TextMessageMapperManager;


@RestController
@RequestMapping("/codeLinc6")
public class TwilioController
{
	@Autowired
	TextMessageMapperManager textMessage;
	
	@GetMapping("/sendTextMessage")
	public int sendTextMessage(@RequestParam("txt") String text)
	{
		
		textMessage.sendTextMessage(text);
		return 1;
	}
	
}