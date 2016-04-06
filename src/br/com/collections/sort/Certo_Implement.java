package br.com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Certo_Implement {

	public static void main(String[] args) {
		List<Aluno_Certo> lista = new ArrayList<Aluno_Certo>();

		Aluno_Certo a = new Aluno_Certo("João da Silva", "Linux básico", 0);
		Aluno_Certo b = new Aluno_Certo("Antonio Sousa", "OpenOffice", 0);
		Aluno_Certo c = new Aluno_Certo("Lúcia Ferreira", "Internet", 0);

		lista.add(a);
		lista.add(b);
		lista.add(c);

		Collections.sort(lista);
		System.out.println(lista);
	}

}
