create database cadastroAluno

create table tb_endereco(
	id_endereco integer auto_increment primary key not null,
	cep varchar(8) not null,
	logradouro varchar(12) not null,
	numero varchar(10) not null,
	bairro varchar(20) not null,
	complemento varchar(50),
	estado varchar(2) not null,
	cidade varchar(50) not null
)

create table tb_aluno(
	id_aluno integer auto_increment primary key not null,
	nome varchar(50) not null,
	data_nascimento date not null,
	periodo integer not null,
	curso varchar(50) not null,
	cpf varchar(11) not null,
	rg varchar(10) not null,
	endereco integer,
	foreign key (endereco) references tb_endereco(id_endereco)
);