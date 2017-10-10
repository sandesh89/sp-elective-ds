package com.abhishek.validator;

public interface Validator<T> {
	
	boolean validate(T t);

}
