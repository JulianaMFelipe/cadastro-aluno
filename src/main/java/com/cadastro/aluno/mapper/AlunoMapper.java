package com.cadastro.aluno.mapper;

import com.cadastro.aluno.domain.AlunoDomain;
import com.cadastro.aluno.domain.EnderecoDomain;
import com.cadastro.aluno.dto.AlunoDTO;
import com.cadastro.aluno.dto.EnderecoDTO;

import java.util.ArrayList;
import java.util.List;

public class AlunoMapper {

    public static EnderecoDomain toDomain(EnderecoDTO dto) {
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

    public static AlunoDomain toAlunoDomain(AlunoDTO alunoDTO) {
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

    public static List<AlunoDTO> toListDTO(List<AlunoDomain> aluno) {
        List<AlunoDTO> listaDTO = new ArrayList<>();
        for (AlunoDomain a : aluno) {
            listaDTO.add(toDTO(a));
        }
        return listaDTO;
    }

    private static AlunoDTO toDTO(AlunoDomain alunoDomain) {
        AlunoDTO alunoDTO = new AlunoDTO();
        alunoDTO.setCpf(alunoDomain.getCpf());
        alunoDTO.setCurso(alunoDomain.getCurso());
        alunoDTO.setDataNascimento(alunoDomain.getDataNascimento());
        alunoDTO.setRg(alunoDomain.getRg());
        alunoDTO.setNome(alunoDomain.getNome());
        alunoDTO.setPeriodo(alunoDomain.getPeriodo());
        alunoDTO.setEndereco(toEnderecoDTO(alunoDomain.getEndereco()));

        return alunoDTO;
    }

    private static EnderecoDTO toEnderecoDTO(EnderecoDomain domain) {
        EnderecoDTO endereco = new EnderecoDTO();
        endereco.setCep(domain.getCep());
        endereco.setLogradouro(domain.getLogradouro());
        endereco.setNumero(domain.getNumero());
        endereco.setBairro(domain.getBairro());
        endereco.setComplemento(domain.getComplemento());
        endereco.setEstado(domain.getEstado());
        endereco.setCidade(domain.getCidade());

        return endereco;
    }
}
