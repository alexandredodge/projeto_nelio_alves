package com.alexandre.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexandre.cursomc.domain.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria,Integer>{
 
}
