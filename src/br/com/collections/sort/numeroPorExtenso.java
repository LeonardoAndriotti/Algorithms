package br.com.collections.sort;
/**numeroPorExenso, representa o elo de ligação entre os objetos numero,transformaArray,
 * OrdenaDes e numeroExtenso.
 * 
 * que são responsavel por pegar um valor inteiro e no final mostra na tela o valor em ordem decrescente,
 * por extenso
 * 
 * @author Leonardo Andriotti
 *
 */
public class numeroPorExtenso {
	/**
	 *  objeto numero , recebe um valor inteiro, que repassa ao objeto, para transformar em um array.
	 * @param valor -> recebe um inteiro
	 * @return -> retorna o valor digitado para proximo objeto
	 */
	public int numero(int valor) {
		return valor;
	}

	
	
	/** 
	 * 
	 * @param numero -> recebe um inteiro do objeto numero.
	 * @return -> retorna um array do inteiro recebido
	 */
	public int[] transformaArray(int numero) {

		String divide = String.valueOf(numero);
		String[] quebra = divide.split("");

		int[] converte = new int[quebra.length - 1];

		for (int i = 1; i < converte.length + 1; i++) {
			converte[i - 1] = Integer.parseInt(quebra[i]);
		}

		return converte;
	}

	/** 
	 * 
	 * @param numero[] -> recebe um array, para colocar em ordem decrescente
	 * @return -> retorna o array em ordem decrescente
	 */
	public int[] OrdenaDes(int[] numero) {
		int aux;

		for (int i = 0; i < numero.length; i++) {

			for (int j = 0; j < (numero.length - 1); j++) {

				if (numero[j] < numero[j + 1]) {
					aux = numero[j];
					numero[j] = numero[j + 1];
					numero[j + 1] = aux;
				}
			}
		}
		return numero;
	}

	/** 
	 * 
	 * @param numero --> recebe um array do objeto ordenaDes.
	 * @return -> retorna o valor por extenso
	 */
	public String[] numeroExtenso(int[] numero) {
		
		String[] extenso = new String[numero.length];
		String[] unidade = { "zero", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove" };
		String[] dezena = { "dez", "onze", "doze", "treze", "quatroze", "quize", "desseseis", "dessesete", "dessoito",
				"dessenove" };
		String[] dezena2 = { "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
		String[] centena = { "cem", "docentos", "trecentos", "quatrocentos", "quinhetos", "seiscentos", "setecentos",
				"oitocentos", "novecentos" };

		/**
		 * criei três ifs que pegam o tamanho do array, passar para uma variavel tamanho.
		 * 
		 * tamanho é responsalvel pelo contole de casas,
		 *  
		 * tamanho = 3; (números, na casa das centenas).
		 * tamanho = 2; (números, na casa das dezenas).
		 * tamanho = 1; (número, na casa das unidades).
		 * 
		 * os if--> trata a condição que se o tamanho é n , e array de numero[n] é diferente de zero, 
		 * ele pode imprimir o valor, por extenso.
		 * 
		 * 
		 */

		int tamanho = numero.length;

		/*
		 * 0 --> c 1-->d 2--->u /* tamanho referencia a quantidades de numeros
		 */
		for (int i = 0; i < numero.length; i++) {
			// centena
			if ((tamanho == 3) && (numero[0] != 0)) {
				tamanho = tamanho - 1;
				System.out.print(centena[numero[0] - 1]);
				System.out.print(" e ");
                extenso[0]= centena[numero[0]-1];
			}
			// dezena
			if ((tamanho == 2) && (numero[1] != 0)) {
				if (numero[1] > 1) {
					System.out.print(dezena2[numero[1] - 2]);
					System.out.print(" e ");
					extenso[1]=dezena2[numero[1]-2];
					
					tamanho = tamanho - 1;
					
				} else {
					System.out.println(dezena[numero[2]]);
					extenso[1]=dezena[numero[2]];
	
					break;
				}

			}
			// unidade
			if ((tamanho == 1) && (numero[2] != 0)) {
				System.out.println(unidade[numero[2]]);
				extenso[2]=unidade[numero[2]];
				
				break;
			}
		}

		return extenso;
	}

	public static void main(String[] args) {

		numeroPorExtenso extenso = new numeroPorExtenso();
		/**
		 * passando um número para método numero e pegando valor para passar
		 * para metodo que t transforma numero para um array, depois passando o
		 * array gerado para o metodo que coloca o array em ordem decrescente
		 * depois por ultimo passa por extenso o valor
		 */
		int transform = extenso.numero(120);

		int[] convert = extenso.transformaArray(transform);
		int[] ext = extenso.OrdenaDes(convert);
	    extenso.numeroExtenso(ext);
		

	}
}
