package es.curso.donasangre.backbeans;

import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import es.curso.donasangre.entity.Donante;
import es.curso.donasangre.repository.DonanteRepository;

@Scope(value = "session")
@Component(value = "controlador")
public class ManejadorHome {

	private String hola = "hola";
	Logger logger = LoggerFactory.getLogger(ManejadorHome.class);

	@Autowired
	private DonanteRepository donanteRepository;

	@PostConstruct
	public void incializaManejador() {

		List<Donante> donantes = donanteRepository.obtenerTodosDonantes();
		logger.info("######## a ver a ver ########");
		for (Donante donante : donantes) {
			logger.info(donante.getNombre());
		}
		logger.info("######## fin ########");
	}

	public String navega() {
		return "hola";
	}

	public String getHola() {
		return hola;
	}

	public void setHola(String hola) {
		this.hola = hola;
	}

}
