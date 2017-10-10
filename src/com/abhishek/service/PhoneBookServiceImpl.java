package com.abhishek.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.abhishek.data.PhoneBookEntry;
import com.abhishek.resolver.ContactResolver;

public class PhoneBookServiceImpl implements PhoneBookService {
	
	private Map<String, PhoneBookEntry> phoneBook=new HashMap<>();

	class ContactIdGenerator {
		
		String generateUniqueId() {
			return UUID.randomUUID().toString();
		}
		
	}
	@Override
	public boolean addEntry(PhoneBookEntry phoneBookEntry) {
		
		return false;
	}

	@Override
	public PhoneBookEntry removeEntry(String displayStr, ContactResolver resolver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhoneBookEntry searchEntry(String displayStr, ContactResolver resolver) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
