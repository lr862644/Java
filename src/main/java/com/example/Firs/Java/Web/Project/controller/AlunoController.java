package com.example.Firs.Java.Web.Project.controller;

import com.example.Firs.Java.Web.Project.entity.Aluno;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("aluno")
public class AlunoController {

    private static final Logger log = LoggerFactory.getLogger(AlunoController.class);

    @GetMapping
    public List<Aluno> getAlunos(){
        List<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno();
        a1.setId(1L);
        a1.setNome("Leandro Reis");
        a1.setDataNascimento(LocalDate.of(1998,04, 07));
        a1.setMatricula("20152040070288");
        a1.setPeriodo("9");

        alunos.add(a1);
        alunos.add(a1);

        return alunos;

    }


}
