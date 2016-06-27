package br.com.library.Sort;

import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
	int i;
	int j;
	int eleito;
	int[]aranjo = {9,6,2,8,4};
	for (i = 0; i < aranjo.length; i++) {
		eleito = aranjo[i];
		for (j = i;(j>0)&&(aranjo[j-1]>eleito);j--) {
			aranjo[j]=aranjo[j-1];
		}
		aranjo[j]= eleito;
	}
	System.out.println(Arrays.toString(aranjo));
}
}
