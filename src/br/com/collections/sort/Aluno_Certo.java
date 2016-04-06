package br.com.collections.sort;


public class Aluno_Certo implements Comparable<Aluno_Certo>{
	 private String nome;
	 private String curso;
	 double nota;
	
  Aluno_Certo(String nome, String curso, double nota) {
    this.nome = nome;
    this.curso = curso;
    this.nota = nota;
  }
	
  public String toString() {
    return this.curso;
  }
	
  public int compareTo(Aluno_Certo curso) {
    return this.nome.compareTo(curso.getCurso());
  }
	
  // Métodos getters e setters

  public String getCurso() {
    return this.curso;
  }
}

