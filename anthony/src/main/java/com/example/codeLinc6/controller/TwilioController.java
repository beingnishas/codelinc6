package com.example.codeLinc6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.codeLinc6.mapperManager.TextMessageMapperManager;


@RestController
@RequestMapping("/codeLinc")
public class TwilioController
{
	@Autowired
	TextMessageMapperManager textMessage;
	
	@PostMapping("/sendTextMessage")
	public int sendTextMessage(@RequestParam("txt") String text)
	{
		
		textMessage.sendTextMessage(text, true);
		return 1;
	}
	
}