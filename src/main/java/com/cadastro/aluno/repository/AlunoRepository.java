package com.cadastro.aluno.repository;

import com.cadastro.aluno.domain.AlunoDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<AlunoDomain, Integer> {
}
