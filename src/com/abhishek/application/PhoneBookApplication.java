package com.abhishek.application;

import java.util.List;

import com.abhishek.data.PhoneBookEntry;
import com.abhishek.data.SearchResultEntry;

public class PhoneBookApplication implements PhoneBookOperation ,PrefixSearchOperation {

	@Override
	public boolean add(PhoneBookEntry phoneBookEntry) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PhoneBookEntry remove(String contactId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhoneBookEntry searchByName(String searchKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PhoneBookEntry searchByNumber(String searchKey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearchResultEntry> prefixSearch(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearchResultEntry> search(String subStr) {
		// TODO Auto-generated method stub
		return null;
	}}
