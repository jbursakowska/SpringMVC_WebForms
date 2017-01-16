package com.yolonerds.model;

public class WebFormModel {
	
	private int formId;

	private String email;
	private String password;
	private String password2;
	private String firstName;
	private String lastName;
	
	public WebFormModel(){
		
	}
	
	public WebFormModel(int formId, String email, String password, String password2, String firstName, String lastName){
		this.formId = formId;
		this.email = email;
		this.password = password;
		this.password2 = password2;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
