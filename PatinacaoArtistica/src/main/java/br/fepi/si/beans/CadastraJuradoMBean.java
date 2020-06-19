package br.fepi.si.beans;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.fepi.si.model.Jurado;



@ManagedBean
@ViewScoped
public class CadastraJuradoMBean implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Jurado jurado = new Jurado();
	private List<Jurado> jurados = new ArrayList<>();
	
	public void inserir() {
		this.jurados.add(jurado);
		this.jurado = new Jurado();
		FacesMessage msg = new FacesMessage("Jurado salvo na lista");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance()
					.addMessage(null, msg);				
	}

	public Jurado getJurado() {
		return jurado;
	}

	public void setJurado(Jurado jurado) {
		this.jurado = jurado;
	}

	public List<Jurado> getJurados() {
		return jurados;
	}

	public void setJurados(List<Jurado> jurados) {
		this.jurados = jurados;
	}
	
	
	

}
