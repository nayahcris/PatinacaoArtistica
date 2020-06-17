package br.fepi.si.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name= "nota")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private int id; 
	private float composicao;
	private float velocidade;
	private float utilizacaoDoGelo;
	private float movimentos;
	private float posturaEstilo; 
	private float expressividadeMusical;
	private float mediaDaNota;
	private Jurado jurado;
	private Patinador patinador; 
	
	public Nota() {}

	@Id
	@GeneratedValue(generator = "inc")
	@Column (name = "id_nota")
	@GenericGenerator(name = "inc", strategy = "increment")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column (name = "nota_composicao",  nullable = false)
	public float getComposicao() {
		return composicao;
	}
	
	public void setComposicao(float composicao) {
		this.composicao = composicao;
	}

	@Column (name = "nota_velocidade",  nullable = false)
	public float getVelocidade() {
		return velocidade;
	}

	
	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}

	@Column (name = "nota_utilizacao_gelo",  nullable = false)
	public float getUtilizacaoDoGelo() {
		return utilizacaoDoGelo;
	}

	public void setUtilizacaoDoGelo(float utilizacaoDoGelo) {
		this.utilizacaoDoGelo = utilizacaoDoGelo;
	}

	@Column (name = "nota_movimento",  nullable = false)
	public float getMovimentos() {
		return movimentos;
	}

	public void setMovimentos(float movimentos) {
		this.movimentos = movimentos;
	}

	@Column (name = "nota_postura",  nullable = false)
	public float getPosturaEstilo() {
		return posturaEstilo;
	}

	public void setPosturaEstilo(float posturaEstilo) {
		this.posturaEstilo = posturaEstilo;
	}

	@Column (name = "nota_expressividade_musical",  nullable = false)
	public float getExpressividadeMusical() {
		return expressividadeMusical;
	}

	public void setExpressividadeMusical(float expressividadeMusical) {
		this.expressividadeMusical = expressividadeMusical;
	}

	@Column (name = "media_nota")
	public float getMediaDaNota() {
		return mediaDaNota;
	}

	public void setMediaDaNota(float mediaDaNota) {
		this.mediaDaNota = mediaDaNota;
	}

	@ManyToOne
	@JoinColumn (name = "id_jurado")
	public Jurado getJurado() {
		return jurado;
	}

	public void setJurado(Jurado jurado) {
		this.jurado = jurado;
	}

	@ManyToOne
	@JoinColumn (name = "id_patinador")
	public Patinador getPatinador() {
		return patinador;
	}

	public void setPatinador(Patinador patinador) {
		this.patinador = patinador;
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
		Nota other = (Nota) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	
}
