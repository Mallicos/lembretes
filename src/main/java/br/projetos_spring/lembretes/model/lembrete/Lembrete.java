package br.projetos_spring.lembretes.model.lembrete;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "lembretes")
@Entity(name = "Lembrete")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Lembrete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String texto;
    private LocalDate data_criacao_lembrete;
    private LocalDate data_lembrete;

    public Lembrete(DadosCadastroLembrete dados) {
        this.titulo = dados.titulo();
        this.texto = dados.texto();
        this.data_criacao_lembrete = dados.data_criacao_lembrete();
        this.data_lembrete = dados.data_lembrete();
    }

    public void atualizarLembrete(DadosEdicaoLembrete dados) {
        this.titulo = dados.titulo();
        this.texto = dados.texto();
        this.data_lembrete = dados.data_lembrete();
    }
}
