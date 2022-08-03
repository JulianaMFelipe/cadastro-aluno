package com.cadastro.aluno.domain;

import javax.persistence.*;

@Entity
@Table(name = "tb_andereco")
public class EnderecoDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idEndereco;

    @OneToOne(mappedBy = "endereco")
    private AlunoDomain aluno;

    @Column(length = 8)
    private String cep;

    @Column(length = 12)
    private String logradouro;

    @Column(length = 10)
    private String numero;

    @Column(length = 20)
    private String bairro;

    @Column(length = 50)
    private String complemento;

    @Column(length = 2)
    private String estado;

    @Column(length = 50)
    private String cidade;

    public Integer getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Integer idEndereco) {
        this.idEndereco = idEndereco;
    }

    public AlunoDomain getAluno() {
        return aluno;
    }

    public void setAluno(AlunoDomain aluno) {
        this.aluno = aluno;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
