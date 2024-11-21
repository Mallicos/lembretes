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
        this.data_criacao_lembrete = dados.data_criacao_lembrete() != null ? dados.data_criacao_lembrete() : LocalDate.now();
        this.data_lembrete = dados.data_lembrete();
    }

    public void atualizarLembrete(DadosEdicaoLembrete dados) {

        if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }

        if (dados.texto() != null) {
            this.texto = dados.texto();
        }

        if (dados.data_lembrete() != null) {
            this.data_lembrete = dados.data_lembrete();
        }
    }
}
