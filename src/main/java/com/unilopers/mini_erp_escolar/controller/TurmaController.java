package com.unilopers.mini_erp_escolar.controller;

import com.unilopers.mini_erp_escolar.dto.ProfessorResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @PostMapping
    public ProfessorResponseDTO criar(@RequestBody ProfessorResponseDTO dto) {
        return null;
    }
}
