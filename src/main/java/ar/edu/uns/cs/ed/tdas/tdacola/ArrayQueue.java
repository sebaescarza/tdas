package ar.edu.uns.cs.ed.tdas.tdacola;

import ar.edu.uns.cs.ed.tdas.excepciones.EmptyQueueException;
import java.util.ArrayList;


public class ArrayQueue<E> implements Queue<E>{
	
	ArrayList<E> lista;
	
	public ArrayQueue() {
		lista = new ArrayList<E>();
	}

	@Override
	public int size() {
		return lista.size();
	}

	@Override
	public boolean isEmpty() {
		return lista.size() == 0;
	}

	@Override
	public E front() throws EmptyQueueException {
		if(this.isEmpty()) {
			throw new EmptyQueueException("Cola vacia");
		}else {
			return lista.get(0);
		}
	}

	@Override
	public void enqueue(E element) {
		lista.add(element);
	}

	@Override
	public E dequeue() throws EmptyQueueException {
		E toret = null;
		if(this.isEmpty()) {
			throw new EmptyQueueException("Cola vacia");
		}else {
			toret = lista.remove(0);
		}
		return toret;
	}
	
	
	

}
