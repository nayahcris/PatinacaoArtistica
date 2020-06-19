package br.fepi.si.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.fepi.si.model.Patinador2;


@ManagedBean
@ViewScoped
public class CadastraPatinadorMBean implements Serializable {
private static final long serialVersionUID = 1L;
	
	private Patinador2 patinador = new Patinador2();
	private List<Patinador2> patinadores = new ArrayList<>();
	
	public void inserir() {
		this.patinadores.add(patinador);
		this.patinador = new Patinador2();
		FacesMessage msg = new FacesMessage("Patinador salvo na lista");
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance()
					.addMessage(null, msg);				
	}
	
	public Patinador2 getPatinador() {
		return patinador;
	}
	public void setPatinador(Patinador2 patinador) {
		this.patinador = patinador;
	}
	public List<Patinador2> getPatinadores() {
		return patinadores;
	}
	public void setPatinador(List<Patinador2> patinadores) {
		this.patinadores = patinadores;
	}
	

}
