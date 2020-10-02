package es.curso.donasangre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import es.curso.donasangre.entity.Donante;

public interface DonanteRepository extends JpaRepository<Donante, Integer>{
	
	List<Donante> obtenerTodosDonantes();

}
