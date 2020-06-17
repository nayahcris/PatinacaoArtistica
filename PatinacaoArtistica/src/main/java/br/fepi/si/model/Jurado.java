package br.fepi.si.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name= "jurado")
public class Jurado implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id; 
	private String nome;
	private String paisDeOrigem;
	private String genero;

	public Jurado () {}

	
	
	@Id
	@GeneratedValue(generator = "inc")
	@Column (name = "id_jurado")
	@GenericGenerator(name = "inc", strategy = "increment")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column (name = "nome_jurado", length = 50, nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column (name = "pais_jurado", length = 50, nullable = false)
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public String getGenero() {
		return genero;
	}

	@Column (name = "genero_jurado", length = 30, nullable = false)
	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jurado other = (Jurado) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
	
}
