package br.projetos_spring.lembretes.model.lembrete;

import java.time.LocalDate;

public record DadosListagemLembretes(Long id, String titulo, String texto, LocalDate data_lembrete) {

    public DadosListagemLembretes(Lembrete lembrete)  {
        this(lembrete.getId(), lembrete.getTitulo(), lembrete.getTexto(), lembrete.getData_lembrete());
    }

}
