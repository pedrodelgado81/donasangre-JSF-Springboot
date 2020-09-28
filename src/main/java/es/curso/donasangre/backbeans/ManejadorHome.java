package es.curso.donasangre.backbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope (value = "session")
@Component (value = "controlador")
public class ManejadorHome {
	
	private String hola="hola ke ase";

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}
	
	

}
