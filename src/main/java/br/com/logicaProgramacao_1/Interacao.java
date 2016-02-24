package br.com.logicaProgramacao_1;

public class Interacao {
	
	public static void main(String[] args) {
		Pantherinae grandes = new Pantherinae();
		String tigre = grandes.tipoAnimal("tigre");
		System.out.println(tigre);
		System.out.println("=======================================================");
		Felinae pequenos = new Felinae();
		String gato = pequenos.tipoAnimal("gato");
		System.out.println(gato);
    	System.out.println("=======================================================");
    	Felinae pequeno = new Felinae();
		String teste = pequenos.tipoAnimal("gato manda-chuva");
		System.out.println(teste);
	
	
	}
}
