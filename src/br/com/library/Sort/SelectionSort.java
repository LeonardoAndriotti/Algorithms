package br.com.library.Sort;

import java.util.Arrays;
/** nao funciona-*/
public class SelectionSort {
	public static void main(String[] args) {
		int[] aranjo = { 9, 5, 10, 1, 3, 78, 90 };
		
		for (int fixo = 0; fixo < aranjo.length-1; fixo++) {
			int menor = fixo;
			for (int i = fixo+1; i < aranjo.length; i++) {
				if (aranjo[i] < aranjo[menor]) {
					menor = i;
				}
			}
			if (menor!= fixo) {
				int aux = aranjo[fixo];
				aranjo[fixo] = aranjo[menor];
				aranjo[menor] = aux;
			}
		}

		System.out.println(Arrays.toString(aranjo));

	}
}
