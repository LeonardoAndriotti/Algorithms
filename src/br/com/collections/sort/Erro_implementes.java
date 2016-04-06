package br.com.collections.sort;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Erro_implementes {
	public static void main(String[] args) {
	    List<Aluno_Erro> lista = new ArrayList<Aluno_Erro>();
		
	    Aluno_Erro a = new Aluno_Erro("João da Silva", "Linux básico", 0);
	    Aluno_Erro b = new Aluno_Erro("Antonio Sousa", "OpenOffice", 0);
	    Aluno_Erro c = new Aluno_Erro("Lúcia Ferreira", "Internet", 0);
	    
	    lista.add(a);
	    lista.add(b);
	    lista.add(c);
	    
	   // Collections.sort(lista);
	    System.out.println(lista);
	  
	   
	  }
}

	
