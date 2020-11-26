package com.alexandre.cursomc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alexandre.cursomc.domain.Categoria;
import com.alexandre.cursomc.repositories.CategoriaRepository;
import com.alexandre.cursomc.services.CategoriaService;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	CategoriaRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat = new Categoria();
		Categoria cat2 = new Categoria();
		Categoria cat3 = new Categoria();
		Categoria cat4 = new Categoria();
		
		cat.setNome("Informática");
		cat2.setNome("Escritório");
		cat3.setNome("Desenvolvimento");
		cat4.setNome("Saúde");
		
		repo.saveAll(Arrays.asList(cat,cat2,cat3,cat4));
	}

}
