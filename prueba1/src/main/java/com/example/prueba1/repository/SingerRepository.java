package com.example.prueba1.repository;

import com.example.prueba1.model.Singer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SingerRepository extends JpaRepository<Singer, Integer> {
}
