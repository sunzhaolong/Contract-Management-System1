package com.ruanko.utils;


public class AppException extends Exception {
	
	private int exceptionCode;		//Exception code
	private String message;			//Exception message
	

	public AppException(String message) {
		this.message = message;
	}
	
	
	public AppException(String message,int exceptionCode) {
		this.message = message;
		this.exceptionCode = exceptionCode;
	}
	

	public int getExceptionCode() {
		return exceptionCode;
	}


	public String getMessage() {
		String detailMessage = "��ϸ��Ϣ:"
			+ exceptionCode + " " + message;
		return detailMessage;
	}
}
