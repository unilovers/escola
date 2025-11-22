package com.unilopers.mini_erp_escolar.controller;

import com.unilopers.mini_erp_escolar.dto.TurmaRequestDTO;
import com.unilopers.mini_erp_escolar.dto.TurmaResponseDTO;
import com.unilopers.mini_erp_escolar.model.Professor;
import com.unilopers.mini_erp_escolar.model.Turma;
import com.unilopers.mini_erp_escolar.repository.ProfessorRepository;
import com.unilopers.mini_erp_escolar.repository.TurmaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaRepository turmaRepository;
    private final ProfessorRepository professorRepository;

    public TurmaController(TurmaRepository turmaRepository, ProfessorRepository professorRepository) {
        this.turmaRepository = turmaRepository;
        this.professorRepository = professorRepository;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<TurmaResponseDTO> create(@RequestBody TurmaRequestDTO dto) {

        Professor professor = professorRepository.findById(dto.getProfessorId())
                .orElseThrow(() -> new RuntimeException("Professor não encontrado"));

        Turma turma = new Turma();
        turma.setNome(dto.getNome());
        turma.setProfessor(professor);

        turmaRepository.save(turma);

        return ResponseEntity.ok(toResponse(turma));
    }

}
