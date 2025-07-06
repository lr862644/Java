package com.example.Firs.Java.Web.Project.repository;

import com.example.Firs.Java.Web.Project.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


}
