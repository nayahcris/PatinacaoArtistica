package br.fepi.si.model;

import java.io.Serializable;

public class Patinador2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String paisDeOrigem;
	private String genero;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}
	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
	

}