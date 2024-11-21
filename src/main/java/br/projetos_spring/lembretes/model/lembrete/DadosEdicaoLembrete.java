package br.projetos_spring.lembretes.model.lembrete;

import java.time.LocalDate;

public record DadosEdicaoLembrete(Long id, String titulo, String texto, LocalDate data_lembrete) {
}
