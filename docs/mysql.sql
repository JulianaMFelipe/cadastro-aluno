create database cadastroAluno

create table aluno(
	idAluno integer auto_increment primary key not null,
	nome varchar(50) not null,
	dataNascimento date not null,
	periodo integer not null,
	curso varchar(50) not null,
	cpf varchar(11) not null,
	rg varchar(10) not null
);

select * from aluno a

use cadastroAluno;

create table endereco(
	idEndereco integer auto_increment primary key not null,
	idAluno integer not null,
	cep varchar(8) not null,
	logradouro varchar(12) not null,
	numero varchar(10) not null,
	bairro varchar(20) not null,
	complemento varchar(50) not null,
	estado varchar(2) not null,
	cidade varchar(50) not null,
	foreign key (idAluno) references aluno(idAluno)
)