package com.abhishek.application;

import com.abhishek.data.PhoneBookEntry;

public interface PhoneBookOperation extends SearchOperation {
	
	boolean add(PhoneBookEntry phoneBookEntry);
	
	PhoneBookEntry remove(String contactId);
	
	PhoneBookEntry searchByName(String searchKey);
	
	PhoneBookEntry searchByNumber(String searchKey);

}
