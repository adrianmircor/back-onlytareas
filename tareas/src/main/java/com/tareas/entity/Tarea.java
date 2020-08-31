package com.tareas.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="tarea")
public class Tarea {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTarea;
	private String nombre;
	private String responsable;
	
    @JsonFormat(pattern="yyyy-MM-dd")
	private Date fecha;
	private String prioridad;
	
	public Integer getIdTarea() {
		return idTarea;
	}
	public void setIdTarea(Integer idTarea) {
		this.idTarea = idTarea;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getResponsable() {
		return responsable;
	}
	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getPrioridad() {
		return prioridad;
	}
	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}
	
	@Override
	public String toString() {
		return "Tarea [idTarea=" + idTarea + ", nombre=" + nombre + ", responsable=" + responsable + ", fecha=" + fecha
				+ ", prioridad=" + prioridad + "]";
	}
	
	
	
}
