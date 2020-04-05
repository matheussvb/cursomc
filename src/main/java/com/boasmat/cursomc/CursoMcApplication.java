package com.boasmat.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.boasmat.cursomc.domain.Categoria;
import com.boasmat.cursomc.domain.Cidade;
import com.boasmat.cursomc.domain.Estado;
import com.boasmat.cursomc.domain.Produto;
import com.boasmat.cursomc.repositories.CategoriaRepository;
import com.boasmat.cursomc.repositories.CidadeRepository;
import com.boasmat.cursomc.repositories.EstadoRepository;
import com.boasmat.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursoMcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CursoMcApplication.class, args);
	}

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private EstadoRepository estadoRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Categoria ct1 = new Categoria(null, "Informática");
		Categoria ct2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);

		ct1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		ct2.getProdutos().addAll(Arrays.asList(p2));

		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));

		p1.getCategorias().addAll(Arrays.asList(ct1));
		p2.getCategorias().addAll(Arrays.asList(ct1, ct2, ct2));
		p3.getCategorias().addAll(Arrays.asList(ct1));

		categoriaRepository.saveAll(Arrays.asList(ct1, ct2));

		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");

		estadoRepository.saveAll(Arrays.asList(est1, est2));

		Cidade cd1 = new Cidade(null, "Uberlândia", est1);
		Cidade cd2 = new Cidade(null, "São Paulo", est2);
		Cidade cd3 = new Cidade(null, "Campinas", est2);

		est1.setCidades(Arrays.asList(cd1));
		est2.setCidades(Arrays.asList(cd2, cd3));

		cidadeRepository.saveAll(Arrays.asList(cd1, cd2, cd3));

	}

}
