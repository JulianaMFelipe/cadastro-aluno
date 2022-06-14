package com.cadastro.aluno.service;

import com.cadastro.aluno.domain.AlunoDomain;
import com.cadastro.aluno.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class CadastroAlunoService {

    final AlunoRepository alunoRepository;

    public CadastroAlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public Object save(AlunoDomain alunoDomain) {
        return alunoRepository.save(alunoDomain);
    }

}
