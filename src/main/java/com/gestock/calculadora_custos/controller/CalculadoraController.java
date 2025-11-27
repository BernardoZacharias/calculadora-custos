package com.gestock.calculadora_custos.controller;

import com.gestock.calculadora_custos.dto.*;
import com.gestock.calculadora_custos.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
@CrossOrigin(origins = "*")
public class CalculadoraController {

    private final CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @PostMapping("/funcionario")
    public ResponseEntity<FuncionarioResponse> calcularFuncionario(
            @RequestBody FuncionarioRequest request) {
        FuncionarioResponse resp = service.calcularFuncionario(request);
        return ResponseEntity.ok(resp);
    }

    @PostMapping("/estoque")
    public ResponseEntity<EstoqueResponse> calcularEstoque(
            @RequestBody EstoqueRequest request) {
        EstoqueResponse resp = service.calcularEstoque(request);
        return ResponseEntity.ok(resp);
    }
}
