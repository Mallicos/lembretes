package br.projetos_spring.lembretes.model.lembrete;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosEdicaoLembrete(
        @NotNull
        Long id,
        String titulo,
        String texto,
        LocalDate data_lembrete
    ) {
}
