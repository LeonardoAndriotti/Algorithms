package br.com.logicaProgramacao_0;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Ciência da Computação Exercício 1 1. Identifique as classes, a relação entre
 * as classes, os atributos das classe e seus métodos com base no texto abaixo
 * a. Os felídeos (latim científico: Felidae) constituem uma família de animais
 * mamíferos digitígrados, da ordem dos carnívoros. A espécie mais comum no
 * mundo hoje é o gato doméstico, que já convive com os seres humanos por cerca
 * de 10 mil anos, no entanto, existem muitas outras espécies selvagens, como os
 * grandes felinos. Existem duas subfamílias de felídeos: Pantherinae (que
 * inclui tigres, leões, onçaspintadas e leopardos) e Felinae (que inclui
 * guepardos,suçuaranas, linces, jaguatiricas e gatos domésticos). Os primeiros
 * exemplares da família surgiram durante o oligoceno, cerca de 25 milhões de
 * anos atrás. Na préhistória, também existia uma terceira subfamília denominada
 * Machairodontinae, em que faziam parte os felídeos dentesdesabre como o
 * Smilodon. Apesar dassemelhanças superficiais, os também extintos
 * Thylacosmilus e Nimravidae não estão incluídos na família Felidae. (fonte:
 * https://pt.wikipedia.org/wiki/Felidae )
 * 
 * @author BmLeonardo
 *
 */
public class EntradaDados {
	Path arquivo; // Path recebe o caminho até o arquivo desejado;
	Integer numeroLinhas;

	public EntradaDados() {

		this.arquivo = Paths.get("C:\\Users\\BmLeonardo\\Documents\\Cadastro-Cliente-JDBC-4Semestre\\"
				+ "LogicaDeProgramacao\\texto.txt");
		leitura();
	}

	/**
	 * Metodo, de leitura de arquivo; recebe um arquivo, passa em byte
	 */
	public void leitura() {
		try {
			byte[] retorno = Files.readAllBytes(arquivo);
			if (retorno.length >= 0) {
				System.out.println(new String(retorno));
				numeroLinhas = retorno.length;
			} else {
				System.err.println("Número de linha menor que zero");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.err.println("\n\nProcesso finalizado.\n total de linhas :" + numeroLinhas);

		}

	}

	public static void main(String[] args) {
		new EntradaDados();
	}

}
