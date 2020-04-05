package com.boasmat.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boasmat.cursomc.domain.Categoria;
import com.boasmat.cursomc.domain.Cidade;
import com.boasmat.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
