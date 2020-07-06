package com.in28minutes.data.api;

import java.util.Arrays;
import java.util.List;

// External Service - Lets say this comes from WunderList
public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn Dance");
	}
	
}