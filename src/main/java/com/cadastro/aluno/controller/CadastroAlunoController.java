package com.cadastro.aluno.controller;

import com.cadastro.aluno.dto.AlunoDTO;
import com.cadastro.aluno.service.CadastroAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroAlunoController {

    @Autowired
    private CadastroAlunoService cadastroAlunoService;
//
//    public CadastroAlunoController(CadastroAlunoService cadastroAlunoService) {
//        this.cadastroAlunoService = cadastroAlunoService;
//    }

    @PostMapping
    public ResponseEntity<Void> cadastrarAluno(AlunoDTO aluno) {

        cadastroAlunoService.cadastrarAluno(aluno);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
