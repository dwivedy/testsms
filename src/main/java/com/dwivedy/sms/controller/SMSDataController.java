package com.dwivedy.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dwivedy.sms.domain.SMSData;
import com.dwivedy.sms.service.SMSDataService;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/services")
public class SMSDataController {
	
	@Autowired
	SMSDataService smsDataService;
	
	@GetMapping("/list")
	public Iterable<SMSData> list(){
		return smsDataService.list();
	}
	
	@PostMapping("/smsData")
	public  SMSData save(@RequestBody SMSData smsData) {
		return smsDataService.save(smsData);
		
	}
	@PostMapping("/smsDatas")
	public Iterable<SMSData> saveList(@RequestBody List<SMSData> smsDatas) {
		return smsDataService.save(smsDatas);
		
	}
	
	@PutMapping("/smsData")
	public  SMSData update(@RequestBody SMSData smsData){
		return smsDataService.update(smsData);
	}
	
	@DeleteMapping("/smsData")
	public ResponseEntity<SMSData> delete(@RequestBody SMSData smsData){
		 smsDataService.delete(smsData);
		 return new ResponseEntity<>(HttpStatus.OK);
	}
	
	 
}
