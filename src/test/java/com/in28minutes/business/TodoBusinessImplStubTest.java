package com.in28minutes.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub()
	{
		TodoService serviceStub = new TodoServiceStub();
		TodoBusinessImpl  todoBIMp = new TodoBusinessImpl(serviceStub);
		List <String> filteredTODOS = todoBIMp.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTODOS.size());
	}
	
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingStub2()
	{
		TodoService serviceStub = new TodoServiceStub();
		TodoBusinessImpl  todoBIMp = new TodoBusinessImpl(serviceStub);
		List <String> filteredTODOS = todoBIMp.retrieveTodosRelatedToSpring("Dummy");
		assertEquals(2, filteredTODOS.size());
	}
}