package com.abhishek.application;

import java.util.List;

import com.abhishek.data.SearchResultEntry;

public interface PrefixSearchOperation{
	
	List<SearchResultEntry> prefixSearch(String key);

}
