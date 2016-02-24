package br.com.logicaProgramacao_1;
/**Ciência da Computação Exercício 1
1. Identifique as classes, a relação entre as classes, os atributos das classe e seus
métodos com base no texto abaixo
a. Os felídeos (latim científico: Felidae) constituem uma família de animais
mamíferos digitígrados, da ordem dos carnívoros. A espécie mais comum no
mundo hoje é o gato doméstico, que já convive com os seres humanos por cerca
de 10 mil anos, no entanto, existem muitas outras espécies selvagens, como os
grandes felinos. Existem duas subfamílias de felídeos: Pantherinae (que inclui
tigres, leões, onçaspintadas
e leopardos) e Felinae (que inclui
guepardos,suçuaranas, linces, jaguatiricas e gatos domésticos). Os primeiros
exemplares da família surgiram durante o oligoceno, cerca de 25 milhões de
anos atrás. Na préhistória,
também existia uma terceira subfamília denominada
Machairodontinae, em que faziam parte os felídeos dentesdesabre
como o
Smilodon. Apesar dassemelhanças superficiais, os também extintos
Thylacosmilus e Nimravidae não estão incluídos na família Felidae. (fonte:
https://pt.wikipedia.org/wiki/Felidae )*/

public class Felideos 
{
	
	private String TipoAnimal;
	private String ordem;
	
	public Felideos() {
		this.TipoAnimal = "Mamiferos";
		this.ordem = "Carnivoros";
	}
	
	public String getTipoAnimal() {
		return TipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	public boolean viveComHomem(String animal){
		
		if(animal== "gato"){
			return true;
		}else{
			return false;
		}

	}
	
	public String origem(){
		return "Surgiram durante o oligoceno, cerca de 25 milhões de anos atrás";
	}


     
}
