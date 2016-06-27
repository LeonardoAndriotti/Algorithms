package br.com.library.Sort;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int aux;
		int[] aranjo = { 9, 6, 7, 2, 8, 1 };
		for (int i = aranjo.length - 1; i >= 1; i--) {
			for (int j = 0; j < i; j++) {
				if (aranjo[j] > aranjo[j + 1]) {
					aux = aranjo[j];
					aranjo[j] = aranjo[j + 1];
					aranjo[j + 1] = aux;
				}

			}
		}
		
		System.out.println(Arrays.toString(aranjo));
	}
}
