package com.example.spikejsonannotations;

import javax.persistence.*;

@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    @ManyToOne
    private Pessoa dono;

    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public Pessoa getDono() {
        return dono;
    }
}
