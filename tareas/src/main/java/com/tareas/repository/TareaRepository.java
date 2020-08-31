package com.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tareas.entity.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Integer> {

}
