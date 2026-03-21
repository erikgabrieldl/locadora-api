package com.example.locadora_api.repository;

import com.example.locadora_api.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Integer> {
    // Só isso! O Spring já sabe fazer os SELECTs sozinho.
}