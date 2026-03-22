package com.example.locadora_api.controller;

import com.example.locadora_api.model.Pessoa;
import com.example.locadora_api.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
@CrossOrigin(origins = "*")
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<String> salvar(@RequestBody Pessoa pessoa){
        pessoaRepository.save(pessoa);
        return ResponseEntity.status(HttpStatus.CREATED).body("foi Tlgd");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluir(@PathVariable Integer id){
        if (pessoaRepository.existsById(id)) {
            pessoaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Deu certo");
        } else  {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Deu Errado");
        }
    }

    @PutMapping("/{id}")
    public Pessoa atualizar(@PathVariable Integer id, @RequestBody Pessoa pessoa){
        pessoa.setId(id);
        return pessoaRepository.save(pessoa);
    }

}
