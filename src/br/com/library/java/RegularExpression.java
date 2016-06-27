package br.com.library.java;

public class RegularExpression {
	public static void main(String[] args) {
		/** 1� express�o.
		 * 
		 * Faz a compara��o de duas String,uma padr�o e um texto, e lan�a um valor booleando 
		 * true = caso igual
		 * false = caso diferente
		 */
		String pattern = "java";
		String text = "java";
		boolean comparador  = text.matches(pattern);
		

		/**
		 * 2� Modificadores
		 * 
		 * (?i) Ignora mai�scula e min�scula
		 * (?x) coment�rios
		 * (?m) multilinhas
		 * (?s) dottal
		 */
		
		comparador = "Java".matches("(?i)java");

		/**
		 * 3� Metacaracteres
		 * 
		 *  . qualquer caracter
		 *  \d d�gitos [0-9]
		 *  \D n�o � digitos[^0-9]
		 *  \s espa�os [\t\n\x0B\f\r]
		 *  \S n�o � espa�os[^\s]
		 *  \w letra [a-zA-Z_0-9]
		 *  \W n�o � letra */ 
		comparador = "12".matches("\\d\\d");
		
		
		/**
		 * Quantificadores
		 * 
		 *X{n}  x,exatamente n vezes
		 *X{n, } x,pelo menos n vezes
		 *X{n,m} X,pelo menos n mas n�o mais do m vezes
		 *X? x,0 ou 1 vez
		 *X* x,0 ou +  vezes
		 *X+,1ou + vezes
		 */
		comparador="87".matches("\\d{2}");
		
		/**
		 * Metacaracter de fronteira
		 * ^ inicia
		 * $ finaliza
		 * | ou
		 */
		comparador ="leo23".matches("^leo.*");
		
		
		/**
		 * Agrupadores
		 * [...] agrupamento
		 * [a-z] alcance
		 * [a-e][i-u] uni�o
		 * [a-z&&[aeiou]] interse��o
		 * [�bc] exce��o
		 * [a-z&&[^m-p]]subtra��o
		 * \x fuga linear
		 */
		comparador ="Leonardo".matches("[A-Z][a-z]*");
		System.out.println(comparador);

		
	}
}
