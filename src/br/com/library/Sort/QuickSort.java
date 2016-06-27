package br.com.library.Sort;

import java.util.Arrays;

public class QuickSort {

	public void ordenar(int[]vetor,int inicio,int fim){
		if(inicio<fim){
			int posicaoPivo = separa(vetor,inicio,fim);
			ordenar(vetor,inicio,posicaoPivo -1);
			ordenar(vetor,posicaoPivo +1,fim);
		}
	}
	public int separa(int[]vetor,int inicio,int fim){
		int pivo = vetor[inicio];
		
		for(int i = inicio+1;i<=fim;){
			if(vetor[i]<=pivo){
				i++;
			}else if(pivo<vetor[fim]){
				fim--;
			}else{
				int troca = vetor[i];
				vetor[i]=vetor[fim];
				vetor[fim]= troca;
				i++;
				fim--;
			}
		}
		vetor[inicio]= vetor[fim];
		vetor[fim]=pivo;
		return fim;
	}
	public static void main(String[] args) {
		int[]aranjo ={9,6,7,5,2,7,783};
		new QuickSort().ordenar(aranjo, 0, aranjo.length-1);
		System.out.println(Arrays.toString(aranjo));
	}
}
