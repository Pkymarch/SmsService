package com.osg.springboot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SMS {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer smsId;
    private String mobile;
    private String message;
    private String status;
    
    
    
	public SMS() {}
	
	public SMS(Integer smsId, String mobile, String message, String status) {
		this.smsId = smsId;
		this.mobile = mobile;
		this.message = message;
		this.status = status;
	}
	public Integer getSmsId() {
		return smsId;
	}
	public void setSmsId(Integer smsId) {
		this.smsId = smsId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "SMS [smsId=" + smsId + ", mobile=" + mobile + ", message=" + message + ", status=" + status + "]";
	}
    
    
}
