package com.example.spikejsonannotations;

import javax.persistence.*;
import java.util.List;

@Entity

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Carro> carros;

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }
}
