package com.cadastro.aluno.mapper;

import com.cadastro.aluno.domain.AlunoDomain;
import com.cadastro.aluno.domain.EnderecoDomain;
import com.cadastro.aluno.dto.AlunoDTO;
import com.cadastro.aluno.dto.EnderecoDTO;

public class AlunoMapper {

    public static EnderecoDomain toDomain(EnderecoDTO dto){
            EnderecoDomain domain = new EnderecoDomain();
            domain.setCep(dto.getCep());
            domain.setLogradouro(dto.getLogradouro());
            domain.setNumero(dto.getNumero());
            domain.setBairro(dto.getBairro());
            domain.setComplemento(dto.getComplemento());
            domain.setEstado(dto.getEstado());
            domain.setCidade(dto.getCidade());

            return domain;
    }

    public static AlunoDomain toAlunoDomain(AlunoDTO alunoDTO){
        AlunoDomain aluno = new AlunoDomain();
        aluno.setCpf(alunoDTO.getCpf());
        aluno.setCurso(alunoDTO.getCurso());
        aluno.setDataNascimento(alunoDTO.getDataNascimento());
        aluno.setRg(alunoDTO.getRg());
        aluno.setNome(alunoDTO.getNome());
        aluno.setPeriodo(alunoDTO.getPeriodo());
        aluno.setEndereco(toDomain(alunoDTO.getEndereco()));

        return aluno;
    }
}
