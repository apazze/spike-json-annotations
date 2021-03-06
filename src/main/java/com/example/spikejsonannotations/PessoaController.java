package com.example.spikejsonannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {
    @Autowired
    PessoaRepository pessoaRepository;
    @PostMapping(path = "/inserir")
    public Pessoa inserir(@RequestBody Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }
}
