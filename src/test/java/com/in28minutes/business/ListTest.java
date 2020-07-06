package com.in28minutes.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void letsMockSizeMethod() {
		//To mock List classs
		List<String> lista = mock(List.class);
		when(lista.size()).thenReturn(2);
		assertEquals(2, lista.size());
	}
	
	@Test
	public void letsMockListSize_ReturnMultipleValues()
	{
		//To mock List classs
		List<String> lista = mock(List.class);
		when(lista.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, lista.size());
		assertEquals(3, lista.size());
	}
	
	@Test
	public void letsMockListGet_String()
	{
		//To mock List classs
		List<String> lista = mock(List.class);
		when(lista.get(0)).thenReturn("nsc1").thenReturn("nsc2");
		assertEquals("nsc1", lista.get(0));
		assertEquals(null, lista.get(1));
	}
	
	@Test
	public void letsMockListGet_Int()
	{
		//To mock List classs
		List<String> lista = mock(List.class);
		when(lista.get(anyInt())).thenReturn("nsc1").thenReturn("nsc2");
		assertEquals("nsc1", lista.get(0));
		assertEquals("nsc2", lista.get(255));
	}
	
	@Test(expected=RuntimeException.class)
	public void letsMockListGet_ThrowException()
	{
		//To mock List classs
		List<String> lista = mock(List.class);
		when(lista.get(anyInt())).thenThrow(new RuntimeException("Ex"))	;	
		lista.get(2555);
	}

}
