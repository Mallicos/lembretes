package br.projetos_spring.lembretes.model;

import br.projetos_spring.lembretes.model.lembrete.Lembrete;

import java.time.LocalDate;

public record DadosListagemLembretes(Long id, String titulo, String texto, LocalDate dataLembrete) {

    public DadosListagemLembretes(Lembrete lembrete)  {
        this(lembrete.getId(), lembrete.getTitulo(), lembrete.getTexto(), lembrete.getDataLembrete());
    }

}
