package com.abhishek.data;

public class PhoneBookEntry {
	
	private String name;
	private Contact phNumberContact; 
	private Contact emailContact;
	
	public PhoneBookEntry(String name, Contact phNumberContact, Contact emailContact) {
		super();
		this.name = name;
		this.phNumberContact = phNumberContact;
		this.emailContact = emailContact;
	}

	public String getName() {
		return name;
	}

	public Contact getPhNumberContact() {
		return phNumberContact;
	}

	public Contact getEmailContact() {
		return emailContact;
	}

	@Override
	public String toString() {
		return "PhoneBookEntry [name=" + name + ", phNumberContact=" + phNumberContact + ", emailContact="
				+ emailContact + "]";
	}
	
	
}
