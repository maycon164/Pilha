package exercicio;

import java.util.ArrayList;
import java.util.List;

public class Pilha <T>{
	
	List<T> lista = new ArrayList<T>();
	

	public void push(T elemento) {
		if(lista.isEmpty()) {
			lista.add(elemento);
		}else {
			lista.add(0, elemento);
		}
	}
	
	public T pop() {
		if(!lista.isEmpty()) {
			T elemento = lista.get(0);
			lista.remove(0);
			return elemento;
		}
		System.out.println("Pilha Vazia");
		return null;
	}
	
	public void mostrar() {
		System.out.println(lista);
	}
	
	public T topo() {
		if(!lista.isEmpty()) {
			return lista.get(0);
		}
		return null;
		
	}
	
	public int tamanho() {
		return lista.size();
	}
	
	public String toString() {
		StringBuffer palavra = new StringBuffer();
		for(T ch: lista) {
			palavra.append(ch.toString());
		}
		return palavra.toString();
	}
	
}
