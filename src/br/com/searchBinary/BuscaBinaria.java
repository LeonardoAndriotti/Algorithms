package br.com.buscaBinaria;

import java.text.Normalizer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BuscaBinaria {
	public static String removerAcentuacao(String nome) {
		return Normalizer.normalize(nome, Normalizer.Form.NFD).replaceAll(
				"[^\\p{ASCII}]", "");
	}

	public static String busca(String[] vector, String value) {

		int inicio = 0;
		int fim = vector.length - 1;

		while (inicio <= fim) {
			int meio = (inicio + fim) / 2;

			String nome = removerAcentuacao(vector[meio]);

			if (nome.equalsIgnoreCase(value)) {
				return String.valueOf(meio);
			}
			if (value.compareToIgnoreCase(vector[meio]) > 0) {
				inicio = meio + 1;
			} else {
				fim = meio - 1;
			}
		}
		return value;
	}

	public static void main(String[] args) {

		String[] nomes = { "Raul", "Lilia", "Márcio", "Akuma", "Victor",
				"Rayssa", "Nayara", "Valdeci", "Ilda", "Hélio", "Ronilda",
				"Jefferson", "Júlia", "Nicolas", "Gisele", "Ari", "Miriam",
				"Ana", "Letícia", "Wellington", "João", "Roberta", "Mário",
				"Cléber", "Adriano", "Laura", "Valquíria", "Vânia", "Luiza",
				"Priscila", "Jaiane", "Amanda", "Paula", "Regina", "Maria",
				"Maria Rita", "Marli", "José", "Paulo", "Marcos", "Mauro",
				"Fabrício", "Caio", "Kaique", "Kauê", "Karolina", "Karol",
				"Caroline", "Márcia", "Maria Joana", "Rui", "Monique",
				"Clarice", "Cleide", "Macleide", "Edgar", "Flora", "Merlim",
				"Orides", "Romilda", "Luciana", "Juliana", "Luciano",
				"Juliano", "Ricardo", "Renato", "Matheus", "André", "Lucas",
				"Zilma", "Rogério", "Ruan", "Cláudio", "Daniel", "Miguel",
				"Lourenço", "Marcelo", "Antônio", "Luis Carlos",
				"Luis Fernando", "Cristina", "Mayara", "Débora", "Zé Henrique",
				"Kelvy", "Beatriz", "Bianca", "Sandra", "Silmara", "Sumara",
				"Suellen", "Altieres", "Kamilla", "Camille", "Victória",
				"Patrícia", "Odete Santos", "Leonardo", "Thainara", "Jeyssifer" };

		for (int i = 0; i < 100; i++) {
			for (int j = i + 1; j < 100; j++) {
				if ((nomes[i].compareTo(nomes[j])) > 0) {
					String auxiliar = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = auxiliar;
				}
			}
		}
		System.out.println(new BuscaBinaria().busca(nomes,
				"Mayara"));

	}
}