package com.unilopers.mini_erp_escolar.dto;

import lombok.Data;

@Data
public class AlunoResponseDTO {
    private Long id;
    private String nome;
    private String email;
    private String matricula;
}
