package com.dwivedy.sms;


import com.dwivedy.sms.service.SMSDataService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import com.dwivedy.sms.domain.SMSData;

@SpringBootApplication
public class SmsApplication {

	public static void main(String[] args) {
	 
		SpringApplication.run(SmsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(SMSDataService smsDataService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<SMSData>> typeReference = new TypeReference<List<SMSData>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/data.json");
			try {
				List<SMSData> smsDatas = mapper.readValue(inputStream,typeReference);
				smsDataService.save(smsDatas);
				System.out.println("smsData Saved!");
			} catch (IOException e){
				System.out.println("Unable to save smsData: " + e.getMessage());
			}
	    };
	}

}
