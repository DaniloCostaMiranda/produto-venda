package com.ecommerce.produtovenda.domain;

import java.util.Objects;

public class Product {
    private long id;
    private String name;
    private String description;
    private Category category;

    public Product() {
    }

    public Product(long id, String name, String description, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public Category getCategory() {
        return category;
    }

    public Product setCategory(Category category) {
        this.category = category;
        return this;
    }


    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        final Product product = (Product) o;
        return id == product.id &&
                Objects.equals(name, product.name) &&
                Objects.equals(description, product.description);

    }

    @Override
    public int hashCode(){return Objects.hash(id, name, description, category);}

    @Override
    public  String toString(){
        return "Product{"+
                "id=" + id+
                ", name='" + name + '\'' +
                "description ='"+ description + '\''+
                "category name = '"+ category.getName() + '\'' +
                "category description = '"+ category.getDescription() + '\'' +
                '}';
    }
}
