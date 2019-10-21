package com.traning.entity;

import java.io.Serializable;

public class ValidateUser implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String passWord;
	
	public ValidateUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public boolean validate() {
		
		boolean status = false;
		
		if(this.userName.equals("India") && this.passWord.equals("India")) {
			 status = true;
		}
		return status;
	}
}
