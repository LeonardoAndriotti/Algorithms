package br.com.library.java;

public class RegularExpression {
	public static void main(String[] args) {
		/** 1º expressão.
		 * 
		 * Faz a comparação de duas String,uma padrão e um texto, e lança um valor booleando 
		 * true = caso igual
		 * false = caso diferente
		 */
		String pattern = "java";
		String text = "java";
		boolean comparador  = text.matches(pattern);
		

		/**
		 * 2º Modificadores
		 * 
		 * (?i) Ignora maiúscula e minúscula
		 * (?x) comentários
		 * (?m) multilinhas
		 * (?s) dottal
		 */
		
		comparador = "Java".matches("(?i)java");

		/**
		 * 3º Metacaracteres
		 * 
		 *  . qualquer caracter
		 *  \d dígitos [0-9]
		 *  \D não é digitos[^0-9]
		 *  \s espaços [\t\n\x0B\f\r]
		 *  \S não é espaços[^\s]
		 *  \w letra [a-zA-Z_0-9]
		 *  \W não é letra */ 
		comparador = "12".matches("\\d\\d");
		
		
		/**
		 * Quantificadores
		 * 
		 *X{n}  x,exatamente n vezes
		 *X{n, } x,pelo menos n vezes
		 *X{n,m} X,pelo menos n mas não mais do m vezes
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
		 * [a-e][i-u] união
		 * [a-z&&[aeiou]] interseção
		 * [âbc] exceção
		 * [a-z&&[^m-p]]subtração
		 * \x fuga linear
		 */
		comparador ="Leonardo".matches("[A-Z][a-z]*");
		System.out.println(comparador);

		
	}
}
