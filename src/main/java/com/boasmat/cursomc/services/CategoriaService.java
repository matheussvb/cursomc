package com.boasmat.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boasmat.cursomc.domain.Categoria;
import com.boasmat.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository catRepository;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = catRepository.findById(id);
		return obj.orElse(null);
	}

}
