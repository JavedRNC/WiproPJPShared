package com.wipro;

public class DefaultMessage {
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public void display() {
		System.out.println("Welcome to "+msg);
	}
}
