package com.example.Firs.Java.Web.Project.service;

import com.example.Firs.Java.Web.Project.entity.Aluno;
import com.example.Firs.Java.Web.Project.repository.AlunoRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AlunoService {

   // @Autowired
    private final AlunoRepository alunoRepository;

    private final ModelMapper modelMapper;

    public List<Aluno> getAlunos(){
        List<Aluno> alunos = alunoRepository.findAll();
        for(Aluno aluno: alunos) {
            aluno.setId(null);
        }
        return alunos;

    }
    public Aluno getAluno(Long id){
        return  alunoRepository
                .findById(id).
                orElseThrow(()-> new EntityNotFoundException("Aluno não encontrado"));
    }

    public Aluno updateAluno(Long id, Aluno alunoInput) {
        Aluno alunoBase = getAluno(id);

        modelMapper.map(alunoInput, alunoBase);
        return alunoRepository.save(alunoBase);

        /*
        if (Objects.nonNull(alunoInput.getNome())) {
            alunoBase.setNome(alunoInput.getNome());
        }

        if (Objects.nonNull(alunoInput.getMatricula())) {
            alunoBase.setMatricula(alunoInput.getMatricula());
        }

        if (Objects.nonNull(alunoInput.getPeriodo())){
            alunoBase.setPeriodo(alunoInput.getPeriodo());
        }



        if(Objects.nonNull(alunoInput.getDataNascimento())) {
            alunoBase.setDataNascimento(alunoInput.getDataNascimento());
        }

         */


    }
}
