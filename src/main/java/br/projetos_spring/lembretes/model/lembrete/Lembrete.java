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
    private LocalDate dataCriacaoLembrete;
    private LocalDate dataLembrete;

    public Lembrete(DadosCadastroLembrete dados) {
        this.titulo = dados.titulo();
        this.texto = dados.texto();
        this.dataCriacaoLembrete = dados.dataCriacaoLembrete();
        this.dataLembrete = dados.dataLembrete();
    }
}
