package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Evaluacion;
import com.example.demo.repository.EvaluacionRepository;

@RestController
@RequestMapping("/evaluaciones")
public class EvaluacionController {

    @Autowired
    private EvaluacionRepository repository;

    @PostMapping
    public Evaluacion create(@RequestBody Evaluacion evaluacion) {
        return repository.save(evaluacion);
    }

    @GetMapping
    public List<Evaluacion> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Evaluacion GetById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
