package com.abhishek.data;

public class SearchResultEntry {
	
	private String displayStr;
	private String contactId;
	
	public SearchResultEntry(String displayStr, String contactId) {
		super();
		this.displayStr = displayStr;
		this.contactId = contactId;
	}

	public String getDisplayStr() {
		return displayStr;
	}

	public String getContactId() {
		return contactId;
	}
	
}
