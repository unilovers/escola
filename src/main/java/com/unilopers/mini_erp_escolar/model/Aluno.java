package com.unilopers.mini_erp_escolar.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String matricula;
}
