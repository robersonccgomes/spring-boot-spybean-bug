package com.example;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	private final MyRepository repository;

	public MyService(MyRepository repository) {
		this.repository = repository;
	}
	
	public void doSomething(int param) {
		repository.save(param);
	}

}
