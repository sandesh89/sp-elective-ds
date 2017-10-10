package com.abhishek.service;

import com.abhishek.data.PhoneBookEntry;
import com.abhishek.resolver.ContactResolver;

public interface PhoneBookService {

	boolean addEntry(PhoneBookEntry phoneBookEntry);
	
	PhoneBookEntry removeEntry(String displayStr,ContactResolver resolver);
	
	PhoneBookEntry searchEntry(String displayStr,ContactResolver resolver);
	
}
