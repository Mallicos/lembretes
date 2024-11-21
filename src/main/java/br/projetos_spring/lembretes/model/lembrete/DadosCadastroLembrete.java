package br.projetos_spring.lembretes.model.lembrete;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastroLembrete(
        @NotBlank
        String titulo,
        @NotBlank
        String texto,
        LocalDate data_criacao_lembrete,
        @NotNull
        LocalDate data_lembrete
    ) {
}
