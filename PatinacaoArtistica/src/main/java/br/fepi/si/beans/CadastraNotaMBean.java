package br.fepi.si.beans;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.fepi.si.model.Nota;


public class CadastraNotaMBean implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Nota nota = new Nota();
	private List<Nota> notas = new ArrayList<>();
	
	public void inserir() {
		this.notas.add(nota);
		this.nota = new Nota();
		FacesMessage msg = new FacesMessage("Notas salvas na lista");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance()
					.addMessage(null, msg);				
	}

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}
	
	

}
