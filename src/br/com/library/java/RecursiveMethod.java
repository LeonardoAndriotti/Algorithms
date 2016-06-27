package br.com.library.java;

import java.util.Arrays;
/**
 * código utilizando recursividade em java,para inverte uma sequencia de números dada 
 * a posição inicial e a final
 * 
 * @author Leonardo
 *
 */
public class RecursiveMethod {
	public int[] recursion (int[]sequence,int posX,int posY){
	//aredondar numeros	System.out.println(Math.round(11.5));

		if(posY <= posX)//corpo do if é só sua linha de baixo.
			return sequence;
		
		int aux = sequence[posX];
		sequence[posX]=sequence[posY];
		sequence[posY]= aux;

		return recursion(sequence,posX +1,posY-1);
	}
	
	
    public static void main(String[] args) {
    	
		int[] sequence = {1,2,3,4,5,6,7,8,9};
		RecursiveMethod recursiveMethod = new RecursiveMethod();
		
	    sequence = recursiveMethod.recursion(sequence, 0, 8);
	    System.out.println(Arrays.toString(sequence));
	    
	}
}
