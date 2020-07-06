package com.in28minutes.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.in28minutes.data.api.TodoService;
import com.in28minutes.data.api.TodoServiceStub;

public class TodoBusinessImplMockTest {
	
	//What is mocking?
	//mocking is creating objects that simulate the behaviour of real objects.
	//Unlike stubs, mock can be dinamically created from code - at run time.
	//Mock offer more functionality than stubbing
	//you can verify method calls and other things...
	//they return default values when they are not stubbed
	
	@Test
	public void testRetrieveTodosRelatedToSpring_usingMock()
	{
		//a mock is dinamically created
		TodoService mockTodoService = mock(TodoService.class);
		
		List<String> allTodos = Arrays.asList("Learn Spring MVC",
				"Learn Spring", "Learn to Dance");
		when(mockTodoService.retrieveTodos("Ranga")).thenReturn(allTodos);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(mockTodoService);
		List<String> todos = todoBusinessImpl
				.retrieveTodosRelatedToSpring("Ranga");
		assertEquals(2, todos.size());
	}
	
	
	
}