package com.tareas.service;

import java.util.List;

import com.tareas.entity.Tarea;

public interface ITareaService {

	List<Tarea> listaTareas();
	void guardar(Tarea tarea);
	void eliminar(int idTarea);
}
