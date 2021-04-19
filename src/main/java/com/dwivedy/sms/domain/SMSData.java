package com.dwivedy.sms.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class SMSData {
	
	@Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String city;
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date start_date;
	@JsonFormat(pattern="MM/dd/yyyy")
	private Date end_date;
	private String price;
	private String status;
	private String color;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "SMSData [id=" + id + ", city=" + city + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", price=" + price + ", status=" + status + ", color=" + color + "]";
	}

	
	


}
