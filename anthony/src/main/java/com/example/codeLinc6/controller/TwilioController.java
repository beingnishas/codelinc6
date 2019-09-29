package com.example.codeLinc6.controller;


import com.twilio.*;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioController
{
	public static final String ACCOUNT_SID = "ACdbf1c94c37cda2e838f46225219c962f";
	public static final String AUTH_TOKEN = "78d6ebb45829119c6f041ae81c16d117";
	
	public static void main(String[] args)
	{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator(new PhoneNumber("+18066863249"),
				new PhoneNumber("+7048073107"),
				"Hello World").create();
		
		System.out.println(message.getSid());
	}
}