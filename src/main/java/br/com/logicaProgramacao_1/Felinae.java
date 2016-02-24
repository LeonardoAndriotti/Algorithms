package br.com.logicaProgramacao_1;

public class Felinae extends Felideos {
	private String porte;
	String[] animal = { "guepardos", "sucuaranas", "linces", "jaguatiricas", "gato" };
    
	public String tipoAnimal(String animal){
		boolean resposta = false ;
		
		for(int i = 0 ; i < this.animal.length;i++){
			if(animal == this.animal[i]){
				resposta = true;
				this.porte = "Pequeno porte";
				break;
			}else {
				
				resposta = false;
			}
		}
		if(resposta == false){
			return("animal não reconhecido como da espécie : " + animal);
		}else{
			return "O "  + animal + " é um(a) animal de "+ this.porte +"\n" + getTipoAnimal() +"\n" +getOrdem()
			+"\n"+ origem() + "\n"+
			 "\nAnimal Doméstico :"+viveComHomem(animal);
		}
	
	}



}
