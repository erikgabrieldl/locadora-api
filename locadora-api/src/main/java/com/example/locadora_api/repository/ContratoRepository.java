package com.example.locadora_api.repository;

import com.example.locadora_api.model.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato,Integer> {
}
