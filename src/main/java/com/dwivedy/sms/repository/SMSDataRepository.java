package com.dwivedy.sms.repository;

import org.springframework.data.repository.CrudRepository;

import com.dwivedy.sms.domain.SMSData;

public interface SMSDataRepository extends CrudRepository<SMSData, Long> {

}
