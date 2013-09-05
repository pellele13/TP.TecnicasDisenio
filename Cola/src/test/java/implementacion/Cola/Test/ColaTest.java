package implementacion.Cola.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import implementacion.Cola.Cola;

public class ColaTest {

	private Cola instance;
	
	@Before
	public void setUp(){
		instance = new Cola();
	}

	@Test
	public void testColaIsEmpty() {
		
		boolean actual = instance.isEmpty();
		
		assertTrue(actual);
	}
	
	@Test
	public void testColaIsNotEmpty() {
		
		Object item = new Object();
		instance.add(item);
		
		boolean actual = instance.isEmpty();
		
		assertFalse(actual);
	}
	
	@Test
	public void testColaSinNodos_TamanioCero() {
				
		int actual = instance.size();
		
		assertEquals(0, actual);
	}
	
	@Test
	public void testColaConNodos_TamanioMayorACero() {
				
		Object item = new Object();
		instance.add(item);

		int actual = instance.size();
		
		assertEquals(1, actual);
	}

	@Test
	public void testColaConNodos_RemoverUnNodo() {
				
		Object item = new Object();
		instance.add(item);
		
		Object item2 = new Object();
		instance.add(item2);
		
		instance.remove();
		
		int actual = instance.size();
		
		assertEquals(1, actual);
	}

	@Test
	public void testColaConNodos_DevuelvoPrimero() {
				
		Object item = new Object();
		instance.add(item);
		
		Object item2 = new Object();
		instance.add(item2);
		
		Object expected = new Object();
		
		expected = instance.top();
		
		assertEquals(expected, item);
	}

	
}
