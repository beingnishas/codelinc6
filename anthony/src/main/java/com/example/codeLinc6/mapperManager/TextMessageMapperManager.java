package com.example.codeLinc6.mapperManager;

import org.springframework.stereotype.Component;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

@Component
public class TextMessageMapperManager
{
	public static final String ACCOUNT_SID = "ACdbf1c94c37cda2e838f46225219c962f";
	public static final String AUTH_TOKEN = "78d6ebb45829119c6f041ae81c16d117";
	
	public void sendTextMessage(String text)
	{
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator(new PhoneNumber("+17048073107"), new PhoneNumber("+18066863249"),
				text).create();
		
		//System.out.println(message.getSid());
	}
	
}
