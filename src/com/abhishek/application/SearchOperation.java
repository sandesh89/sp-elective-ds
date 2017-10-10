package com.abhishek.application;

import java.util.List;

import com.abhishek.data.SearchResultEntry;

public interface SearchOperation extends PrefixSearchOperation{

	List<SearchResultEntry> search(String subStr);
}
