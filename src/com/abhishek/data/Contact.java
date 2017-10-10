package com.abhishek.data;

public class Contact {
	
	public enum ContactType{
		NUMBER,
		EMAIL,
		FACEBOOK,
		IM
	}
	
	private String displayStr;
	private ContactType type;

	public Contact(String displayStr,ContactType type) {
		this.displayStr=displayStr;
		this.type=type;
	}

	public String getDisplayStr() {
		return displayStr;
	}

	public ContactType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Contact [displayStr=" + displayStr + ", type=" + type + "]";
	}
	
	
}
