package com.cadastro.aluno.service;

import com.cadastro.aluno.dto.AlunoDTO;
import com.cadastro.aluno.mapper.AlunoMapper;
import com.cadastro.aluno.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroAlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

//    public CadastroAlunoService(AlunoRepository alunoRepository){
//        this.alunoRepository = alunoRepository;
//    }

    public void cadastrarAluno(AlunoDTO aluno){
        alunoRepository.save(AlunoMapper.toAlunoDomain(aluno));
    }

}
