package com.ecommerce.produtovenda.service;

import com.ecommerce.produtovenda.domain.Category;
import com.ecommerce.produtovenda.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
    public Product add(final String name, final String description) {
        return new Product()
                .setName(name)
                .setDescription(description)
                .setCategory(getDefaultCategory());
    }

    private Category getDefaultCategory() {
        return new Category()
                .setName("Padrão")
                .setDescription("Padrão");
    }


}
