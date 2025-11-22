package com.unilopers.mini_erp_escolar.dto;

public class TurmaRequestDTO {
    private String nome;
    private Long professorId;

    public Long getProfessorId() {
        return professorId;
    }

    public void setProfessorId(Long professorId) {
        this.professorId = professorId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
