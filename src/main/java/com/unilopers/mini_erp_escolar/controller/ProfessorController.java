package com.unilopers.mini_erp_escolar.controller;

import com.unilopers.mini_erp_escolar.dto.ProfessorRequestDTO;
import com.unilopers.mini_erp_escolar.dto.ProfessorResponseDTO;
import com.unilopers.mini_erp_escolar.model.Professor;
import com.unilopers.mini_erp_escolar.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @PostMapping
    public ProfessorResponseDTO criar(@RequestBody ProfessorRequestDTO dto) {
        Professor professor = new Professor();
        professor.setNome(dto.getNome());
        professor.setEmail(dto.getEmail());

        Professor salvo = professorRepository.save(professor);

        ProfessorResponseDTO response = new ProfessorResponseDTO();
        response.setId(salvo.getId());
        response.setNome(salvo.getNome());
        response.setEmail(salvo.getEmail());

        return response;
    }


}
