package com.boasmat.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boasmat.cursomc.domain.Categoria;
import com.boasmat.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Categoria ct1 = new Categoria(null, "Informática");
		Categoria ct2 = new Categoria(null, "Escritório");

		categoriaRepository.saveAll(Arrays.asList(ct1, ct2));

	}

}
