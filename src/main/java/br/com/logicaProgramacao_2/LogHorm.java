package br.com.logicaProgramacao_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LogHorm {
	Path arquivo;
	Path arquivo2;
	Path arquivo3;
	Path arquivo4;
	Charset utf8;
	public LogHorm() {
		this.arquivo = Paths.get("src\\br\\com\\exercicio_2\\coor.txt");
		this.arquivo2 = Paths.get("src\\br\\com\\exercicio_2\\coor2.txt");
		this.arquivo3 = Paths.get("src\\br\\com\\exercicio_2\\coor3.txt");
		this.arquivo4 = Paths.get("src\\br\\com\\exercicio_2\\coor4.txt");
		this.utf8 = StandardCharsets.UTF_8;
	}
	
	public void logs(int coorA,int coorB){
		try {
			
			BufferedReader reader  =  Files.newBufferedReader(arquivo, utf8);
			
			String quebra  = reader.readLine();
			String[] chamada  = quebra.split(" ");
			String [][]busca = new String [1][12];
			for (int i = 0; i < chamada.length; i++) {
				busca[0][i] = chamada[i];
			}
			
			System.out.println(busca[coorA][coorB]);
	
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println(-1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		LogHorm horm = new LogHorm();
		horm.logs(1,1);
	}
}
