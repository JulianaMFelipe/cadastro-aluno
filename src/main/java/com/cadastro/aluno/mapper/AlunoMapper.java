package com.cadastro.aluno.mapper;

import com.cadastro.aluno.domain.AlunoDomain;
import com.cadastro.aluno.dto.AlunoDTO;

public class AlunoMapper {
    public static AlunoDomain toAlunoDomain(AlunoDTO alunoDTO){
        AlunoDomain aluno = new AlunoDomain();
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setCurso(alunoDTO.getCurso());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        aluno.setRg(alunoDTO.getRg());
        aluno.setNome(alunoDTO.getNome());
        aluno.setPeriodo(alunoDTO.getPeriodo());

        return aluno;
    }
}
