package com.example.locadora_api.controller;

import com.example.locadora_api.model.Veiculo;
import com.example.locadora_api.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@CrossOrigin(origins = "*") // Isso aqui é a mágica que não deixa o Vercel bloquear seu site depois!
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @GetMapping
    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }


}