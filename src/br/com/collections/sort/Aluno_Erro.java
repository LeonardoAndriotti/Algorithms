package br.com.collections.sort;

public class Aluno_Erro {
	private String nome;
	private String curso;
	double nota;

	public Aluno_Erro(String nome, String curso, double nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}

	public String toString() {
		return this.curso;
	}

	// M�todos getters e setters

	public String getCurso() {
		return this.curso;
	}
}
