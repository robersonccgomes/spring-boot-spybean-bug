package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyServiceTest {

	@Autowired
	private MyService service;
	
	@SpyBean
	MyRepository repository;

	@Test
	public void test() {
		service.doSomething(99);
		Mockito.verify(repository).save(99);
		Mockito.verifyNoMoreInteractions(repository);
	}
}
