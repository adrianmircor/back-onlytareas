package com.tareas.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tareas.entity.Tarea;
import com.tareas.repository.TareaRepository;
import com.tareas.service.ITareaService;

@Service
public class TareaService implements ITareaService {
	
	@Autowired
	private TareaRepository tareaRepo;

	@Override
	public List<Tarea> listaTareas() {
		return tareaRepo.findAll();
	}

	@Override
	public void guardar(Tarea tarea) {
		tareaRepo.save(tarea);
	}

	@Override
	public void eliminar(int idTarea) {
		tareaRepo.deleteById(idTarea);
	}

}
