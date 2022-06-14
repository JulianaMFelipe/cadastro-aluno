package com.cadastro.aluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = JpaRepositoriesAutoConfiguration.class)
@EnableJpaRepositories
public class CadastroAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadastroAlunoApplication.class, args);
	}

}
