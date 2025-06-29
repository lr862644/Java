package com.example.Firs.Java.Web.Project.entity;

import java.time.LocalDate;

public class Aluno {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private String matricula;
    private String periodo;


    public Aluno(Long id, String nome, LocalDate dataNascimento, String matricula, String periodo) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.periodo = periodo;
    }

    public Aluno() {
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo + "°";
    }
}
