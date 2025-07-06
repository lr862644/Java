package com.example.Firs.Java.Web.Project.controller;

import com.example.Firs.Java.Web.Project.entity.Aluno;
import com.example.Firs.Java.Web.Project.repository.AlunoRepository;
import com.example.Firs.Java.Web.Project.service.AlunoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> getAlunos(){

        List<Aluno> alunos = alunoService.getAlunos();
        return alunos;

    }
    @GetMapping("{id}")
    public Aluno getAluno(@PathVariable()Long id){
        Aluno aluno = alunoService.getAluno(id);

        return aluno;

    }
    @PutMapping("{id}")
    public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno alunoInput){

        Aluno aluno = alunoService.updateAluno(id, alunoInput);
        return aluno;

    }


}
