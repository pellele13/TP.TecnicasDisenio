package implementacion.Cola; 

import implementacion.Cola.Nodo;

public class Cola implements Queue {
	private Nodo primero;
	private Nodo ultimo;
	private int tamanio;
		
	public Cola(){
		this.primero = null;
		this.tamanio = 0;
	}
	
	public boolean isEmpty() {
		return tamanio == 0;
	}

	public int size() {
		return tamanio;
	}

	public void add(Object item) {
		Nodo nuevoNodo = new Nodo(item);
		nuevoNodo.setSiguiente(null);
		if (primero == null && ultimo == null){
			primero = nuevoNodo;
			ultimo = nuevoNodo;
		}
		ultimo.setSiguiente(nuevoNodo);
		ultimo = ultimo.getSiguiente();
		tamanio++;
	}

	public Object top() {
		return primero.getDato();
	}

	public void remove() {
		primero = primero.getSiguiente();
		tamanio--;
	}
}