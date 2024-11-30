package com.ejemplo.gestion_tareas.controller;

import com.ejemplo.gestion_tareas.model.Tarea;
import com.ejemplo.gestion_tareas.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaRepository tareaRepository;

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    @GetMapping
    public List<Tarea> obtenerTareas() {
        return tareaRepository.findAll();
    }
}