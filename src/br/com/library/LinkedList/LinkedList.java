package br.com.library.LinkedList;

/**
 *  Estudo de listas encadeadas em java.
 * @author BmLeonardo
 *
 */
public class LinkedList {
	
    private Object elemento;
    private LinkedList proximo;
    private LinkedList anterior;
    
    public LinkedList getAnterior() {
		return anterior;
	}

	public void setAnterior(LinkedList anterior) {
		this.anterior = anterior;
	}

	public void setElemento(Object elemento) {
		this.elemento = elemento;
	}

	public LinkedList(LinkedList proximo,Object elemento){
    	this.proximo = proximo;
    	this.elemento = elemento;
    }
    
    public LinkedList(Object elemento){
    	this.elemento = elemento;
    }
    public void setProximo(LinkedList proximo){
    	this.proximo = proximo;
    }
    public LinkedList getProximo(){
    	return proximo;
    }
    public Object getElemento(){
    	return elemento;
    }  
    
    
    public static void main(String[] args) {
		Celula celula = new Celula();
		
		celula.adiciona("E");
		celula.adiciona("R");
		celula.adiciona("U");
		celula.remove(2);
		celula.adiciona(1, "L");
		
		System.out.println(celula.tamanho()); 
        System.out.println(celula.pega(0)); 
		System.out.println(celula.toString());
	}
}

