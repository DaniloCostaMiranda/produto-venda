package com.ecommerce.produtovenda;

import com.ecommerce.produtovenda.domain.Product;
import com.ecommerce.produtovenda.service.CatalogService;
import com.sun.source.doctree.SystemPropertyTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutoVendaApplication implements CommandLineRunner {

	@Autowired
	private CatalogService catalogService;

	public static void main(String[] args) {
		SpringApplication.run(ProdutoVendaApplication.class, args);
	}


	@Override
	public void run(final String... args) {
		line();
		System.out.println("ProdutoVendaApplication.run");

		System.out.println("Criar produto");

		final Product add = catalogService.add("produto 1", "Descricao 1");
		System.out.println(add);
		line();
	}
	private void line(){
		System.out.println();
		System.out.println("================================");
		System.out.println();

	}
}
