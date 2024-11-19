package br.projetos_spring.lembretes.model.lembrete;

import java.time.LocalDate;

public record DadosCadastroLembrete(String titulo, String texto, LocalDate dataCriacaoLembrete, LocalDate dataLembrete) {
}
