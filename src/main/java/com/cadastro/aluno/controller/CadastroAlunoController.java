package com.cadastro.aluno.controller;

import com.cadastro.aluno.dto.AlunoDTO;
import com.cadastro.aluno.mapper.AlunoMapper;
import com.cadastro.aluno.service.CadastroAlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CadastroAlunoController {

    final CadastroAlunoService cadastroAlunoService;

    public CadastroAlunoController(CadastroAlunoService cadastroAlunoService) {
        this.cadastroAlunoService = cadastroAlunoService;
    }

    @PostMapping("/cadastrar-aluno")
    public ResponseEntity<Object> cadastrarAluno(@RequestBody AlunoDTO aluno) {
        var alunoDomain = AlunoMapper.toAlunoDomain(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(cadastroAlunoService.save(alunoDomain));
    }

    @GetMapping("/recuperar-aluno")
    public List<AlunoDTO> recuperarAlunos() {
        return AlunoMapper.toListDTO(cadastroAlunoService.getAluno());
    }
}
