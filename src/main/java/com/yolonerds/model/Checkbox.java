package com.yolonerds.model;

public class Checkbox {
	
	private int value;
	private String label;
	
	public Checkbox(int value, String label) {
		this.value = value;
		this.label = label;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	
}
