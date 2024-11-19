package br.projetos_spring.lembretes.controller;

import br.projetos_spring.lembretes.model.lembrete.DadosCadastroLembrete;
import br.projetos_spring.lembretes.model.lembrete.Lembrete;
import br.projetos_spring.lembretes.model.lembrete.LembreteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lembrete")
public class LembreteController {

    @Autowired
    private LembreteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroLembrete dados) {
        this.repository.save(new Lembrete(dados));
    }

    public void
}
