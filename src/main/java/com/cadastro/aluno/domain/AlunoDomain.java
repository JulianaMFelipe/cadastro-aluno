package com.cadastro.aluno.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "aluno")
public class AlunoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;

    @Column(name = "nome")
    private String nome;

    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;

    @Column
    private String cpf;

    @Column
    private String rg;

    @Column
    private Integer periodo;

    @Column
    private String curso;

//    private Endereco endereco;

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

//    public Endereco getEndereco() {
//        return endereco;
//    }
//
//    public void setEndereco(Endereco endereco) {
//        this.endereco = endereco;
//    }
}
