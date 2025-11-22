package com.unilopers.mini_erp_escolar.model;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    @OneToMany(mappedBy = "professor")
    private List<Turma> turmas;


}
