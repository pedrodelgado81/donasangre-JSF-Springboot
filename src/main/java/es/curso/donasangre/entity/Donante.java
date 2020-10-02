package es.curso.donasangre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(schema = "donasangre", name = "donante")
@NamedQueries({
		@NamedQuery(name = "Donante.obtenerTodosDonantes", query = "SELECT donante FROM Donante donante") })
public class Donante {

	private Integer id;
	private String nombre;
	private String carneDonante;
	private String grupo;
	private String rh;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "NOMBRE", length = 250)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "CARNE_DONANTE", length = 250)
	public String getCarneDonante() {
		return carneDonante;
	}

	public void setCarneDonante(String carneDonante) {
		this.carneDonante = carneDonante;
	}

	@Column(name = "GRUPO", length = 2)
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Column(name = "RH", length = 1)
	public String getRh() {
		return rh;
	}

	public void setRh(String rh) {
		this.rh = rh;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carneDonante == null) ? 0 : carneDonante.hashCode());
		result = prime * result + ((grupo == null) ? 0 : grupo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((rh == null) ? 0 : rh.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Donante)) {
			return false;
		}
		Donante other = (Donante) obj;
		if (carneDonante == null) {
			if (other.getCarneDonante() != null) {
				return false;
			}
		} else if (!carneDonante.equals(other.getCarneDonante())) {
			return false;
		}
		if (grupo == null) {
			if (other.getGrupo() != null) {
				return false;
			}
		} else if (!grupo.equals(other.getGrupo())) {
			return false;
		}
		if (id == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!id.equals(other.getId())) {
			return false;
		}
		if (nombre == null) {
			if (other.getNombre() != null) {
				return false;
			}
		} else if (!nombre.equals(other.getNombre())) {
			return false;
		}
		if (rh == null) {
			if (other.getRh() != null) {
				return false;
			}
		} else if (!rh.equals(other.getRh())) {
			return false;
		}
		return true;
	}
	
	

}
