package br.com.dio.model;

import java.util.Objects;

/* para organizar o código:CRTL+Shift+f ,CTRL+m deixaa tela cheia*/
public class Gato { 
	private String nome;
	private String cor;
	private Integer idade;

	/*
	 * CTRL3 + constructor using field e cria o bloco public Gato (String nome,
	 * String cor, Integer idade) { this.nome= nome; this.cor = cor; this.idade =
	 * idade; }
	 */
	public Gato(String nome, String cor, Integer idade) {
		this.nome = nome;
		this.cor = cor;
		this.idade = idade;
	}

	/* CTRL+3 e genarate getters e setters */

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/* CTRL+3 e generate equals and hash */
	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	/* CRTL+3 e generate toString só com fields */
	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
	}

}
