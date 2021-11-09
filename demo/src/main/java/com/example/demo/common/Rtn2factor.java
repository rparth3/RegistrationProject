package com.example.demo.common;

public class Rtn2factor {
	String Status ;
	String Details ;
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDetails() {
		return Details;
	}
	public void setDetails(String details) {
		Details = details;
	}
	@Override
	public String toString() {
		return "Rtn2factor [Status=" + Status + ", Details=" + Details + "]";
	}
	
	
}
