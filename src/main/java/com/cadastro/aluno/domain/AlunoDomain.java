package com.cadastro.aluno.domain;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_aluno")
public class AlunoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAluno;

    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name = "endereco")
    private EnderecoDomain endereco;

    @Column(length = 50)
    private String nome;

    @Column
    private LocalDate dataNascimento;

    @Column(length = 11)
    @CPF
    private String cpf;

    @Column(length = 10)
    private String rg;

    @Column
    private Integer periodo;

    @Column(length = 50)
    private String curso;

    public Integer getId() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public EnderecoDomain getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoDomain endereco) {
        this.endereco = endereco;
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
}
