package br.fepi.si.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.fepi.si.model.Patinador;

@ManagedBean
@ViewScoped
public class CadastraPatinadorMBean implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Patinador patinador = new Patinador();
	private List<Patinador> patinadores = new ArrayList<>();
	
	public void inserir() {
		this.patinadores.add(patinador);
		this.patinador = new Patinador();
		FacesMessage msg = new FacesMessage("Patinador salvo na lista");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance()
					.addMessage(null, msg);				
	}
	
	public Patinador getPatinador() {
		return patinador;
	}
	public void setPatinador(Patinador patinador) {
		this.patinador = patinador;
	}
	public List<Patinador> getPatinadores() {
		return patinadores;
	}
	public void setPatinador(List<Patinador> patinadores) {
		this.patinadores = patinadores;
	}
	

}
