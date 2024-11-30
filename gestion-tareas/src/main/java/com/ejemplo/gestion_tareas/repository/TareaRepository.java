package com.ejemplo.gestion_tareas.repository;

import com.ejemplo.gestion_tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {
}

