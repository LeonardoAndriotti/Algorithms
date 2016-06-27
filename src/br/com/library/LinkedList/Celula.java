package br.com.library.LinkedList;

public class Celula {
	private LinkedList primeira;
	private LinkedList ultimo;
	private int totalDeElementos;

	public void adiciona(Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else {
			LinkedList novo = new LinkedList(elemento);
			this.ultimo.setProximo(novo);
			novo.setAnterior(this.ultimo);
			this.ultimo = novo;
			this.totalDeElementos++;

		}
	}
 
	public void adiciona(int posicao, Object elemento) {
		if (this.totalDeElementos == 0) {
			this.adicionaNoComeco(elemento);
		} else if (posicao == this.totalDeElementos) {
			this.adiciona(elemento);
		} else {
			LinkedList anterior = this.pegaCelula(posicao - 1);
			LinkedList proxima = anterior.getProximo();
			LinkedList nova = new LinkedList(anterior.getProximo(), elemento);
			nova.setAnterior(anterior);
			anterior.setProximo(nova);
			proxima.setAnterior(nova);
			this.totalDeElementos++;

		}
	}

	public void adicionaNoComeco(Object elemento) {
		if (this.totalDeElementos == 0) {
			LinkedList nova = new LinkedList(elemento);
			this.primeira = nova;
			this.ultimo = nova;
		}else{
			LinkedList nova = new LinkedList(this.primeira,elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.totalDeElementos++;
	}

	public String toString() {
		// verificando se a lista está vazia
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		LinkedList atual = primeira;

		// percorrendo até o penultimo elemento
		for (int i = 0; i < this.totalDeElementos - 1; i++) {
			builder.append(atual.getElemento());
			builder.append(", ");
			atual = atual.getProximo();
		}
		// último elemento

		builder.append(atual.getElemento());
		builder.append("]");

		return builder.toString();
	}

	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < this.totalDeElementos;
	}

	private LinkedList pegaCelula(int posicao) {
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição não existe");
		}
		LinkedList atual = primeira;
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public Object pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	public void removeDoComeco(){
		
		if(!this.posicaoOcupada(0)){
			throw new IllegalArgumentException("Posição não existe");
		}
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos--;
		
		if(this.totalDeElementos ==0){
			this.ultimo = null;
		}
	}

	public void removeDoFim(){
		
		if(!this.posicaoOcupada(this.totalDeElementos -1)){
			throw new IllegalArgumentException("Posição não existe");
		}
		if(this.totalDeElementos == 1){
			this.removeDoComeco();
		}else{
			LinkedList penultima = this.ultimo.getAnterior();
			penultima.setProximo(null);
			this.ultimo = penultima;
			this.totalDeElementos --;
		}
	}

	public void remove (int posicao){
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException();
		}
		if (posicao ==0){
			this.removeDoComeco();
		}else if(posicao == this.totalDeElementos -1){
			this.removeDoFim();
		}else{
			LinkedList anterior = this.pegaCelula(posicao -1);
			LinkedList atual = anterior.getProximo();
			LinkedList proxima = atual.getProximo();
			
			anterior.setProximo(proxima);
			proxima.setAnterior(anterior);
			
			this.totalDeElementos --;
		}
	}

    public boolean contem(Object elemento){
    	LinkedList atual = this.primeira;
    	
    	while(atual !=null){
    		if(atual.getElemento().equals(elemento)){
    			return true;
    		}
    		atual = atual.getProximo();
    	}
    	return false;
    }

    public int tamanho(){
    	return this.totalDeElementos;
    }
}
