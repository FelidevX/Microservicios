package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.repository.EstudianteRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    private EstudianteRepository repository;

    @PostMapping
    public Estudiante create(@RequestBody Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @GetMapping
    public List<Estudiante> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{rut}")
    public Estudiante getById(@PathVariable String rut) {
        return repository.findById(rut).orElse(null);
    }
}
