package com.dwivedy.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwivedy.sms.domain.SMSData;
import com.dwivedy.sms.repository.SMSDataRepository;


@Service
public class SMSDataService {
	
	@Autowired
	private SMSDataRepository smsDataRepository;
	
	public  SMSData save(SMSData smsData) {
		return smsDataRepository.save(smsData);
		
	}

	public Iterable<SMSData> save(List<SMSData> smsDatas) {
		return smsDataRepository.saveAll(smsDatas);
		
	}
	
	public Iterable<SMSData> list() {
		return smsDataRepository.findAll();
		
	}

	public SMSData update(SMSData smsData) {
		return smsDataRepository.save(smsData);
	}

	public  void delete(SMSData smsData) {
		 smsDataRepository.delete(smsData);
	}

}
