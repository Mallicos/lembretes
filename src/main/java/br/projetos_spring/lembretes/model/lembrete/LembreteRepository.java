package br.projetos_spring.lembretes.model.lembrete;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LembreteRepository extends JpaRepository<Lembrete, Long> {
}
