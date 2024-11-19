package br.projetos_spring.lembretes.controller;

import br.projetos_spring.lembretes.model.DadosListagemLembretes;
import br.projetos_spring.lembretes.model.lembrete.DadosCadastroLembrete;
import br.projetos_spring.lembretes.model.lembrete.Lembrete;
import br.projetos_spring.lembretes.model.lembrete.LembreteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
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

    @GetMapping
    public Page<DadosListagemLembretes> listar(@PageableDefault(size = 5, page = 0, sort = {"titulo"}, direction = Sort.Direction.ASC) Pageable page) {
        return this.repository.findAll(page).map(DadosListagemLembretes::new);
    }
}
