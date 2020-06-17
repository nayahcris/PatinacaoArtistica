package br.fepi.si.app;

import javax.persistence.Persistence;

public class ConectaBancoApp {

	public static void main(String[] args) {
		
		try {
			Persistence.createEntityManagerFactory("patinacaoPU");
			System.out.println("Conectado com sucesso!");
		} catch (Exception e) {
			System.out.println("Falhou! "+e.getMessage());
		}
		

	}

}
