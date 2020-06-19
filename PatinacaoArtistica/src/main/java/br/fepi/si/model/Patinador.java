package br.fepi.si.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name= "patinador")
public class Patinador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int id; 
	private String nome;
	private String paisDeOrigem;
	private String genero;
	private Nota notaJ1;
	private Nota notaJ2;
	private Nota notaJ3;
	private Nota notaJ4;
	private Nota notaJ5;
	private float notaTotal; 
	
	public Patinador() {
		
		super();
	}

	@Id
	@GeneratedValue(generator = "inc")
	@Column (name = "id_patinador")
	@GenericGenerator(name = "inc", strategy = "increment")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	//@Column (name = "nome_patinador", length = 50, nullable = false)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//@Column (name = "pais_patinador", length = 50, nullable = false)
	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}


	//@Column (name = "genero_patinador", length = 30, nullable = false)
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	//@Column (name = "nota_j1")
	public Nota getNotaJ1() {
		return notaJ1;
	}

	public void setNotaJ1(Nota notaJ1) {
		this.notaJ1 = notaJ1;
	}


	//@Column (name = "nota_j2")
	public Nota getNotaJ2() {
		return notaJ2;
	}

	public void setNotaJ2(Nota notaJ2) {
		this.notaJ2 = notaJ2;
	}
	
	
	//@Column (name = "nota_j3")
	public Nota getNotaJ3() {
		return notaJ3;
	}

	
	public void setNotaJ3(Nota notaJ3) {
		this.notaJ3 = notaJ3;
	}


	//@Column (name = "nota_j4")
	public Nota getNotaJ4() {
		return notaJ4;
	}

	
	public void setNotaJ4(Nota notaJ4) {
		this.notaJ4 = notaJ4;
	}


	//@Column (name = "nota_j5")
	public Nota getNotaJ5() {
		return notaJ5;
	}

	public void setNotaJ5(Nota notaJ5) {
		this.notaJ5 = notaJ5;
	}


	//@Column (name= "nota_total")
	public float getNotaTotal() {
		return notaTotal;
	}

	public void setNotaTotal(float notaTotal) {
		this.notaTotal = notaTotal;
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
		Patinador other = (Patinador) obj;
		if (id != other.id)
			return false;
		return true;
	}


	

	
	
	
	
	
	

}
