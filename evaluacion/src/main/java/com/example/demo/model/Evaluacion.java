package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Evaluacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rut;
    private String semestre;
    private String asignatura;
    private Integer evaluacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public Integer getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(int evaluacion) {
        if (evaluacion < 1 || evaluacion > 7) {
            throw new IllegalArgumentException("La evaluación debe estar entre 1 y 7.");
        }
        this.evaluacion = evaluacion;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "id=" + id +
                ", rut='" + rut + '\'' +
                ", semestre='" + semestre + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", evaluacion=" + evaluacion +
                '}';
    }

}
