package com.ecommerce.produtovenda.domain;

import java.util.Objects;

public class Category {

    private long id;
    private String name;
    private String description;

    public Category() {
    }

    public Category(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public Category setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=o.getClass()) return false;
        final Category category = (Category) o;
        return id == category.id &&
                Objects.equals(name, category.name) &&
                Objects.equals(description, category.description);
    }

    @Override
    public int hashCode(){return Objects.hash(id, name, description);}

    @Override
    public  String toString(){
        return "Category{"+
                "id=" + id+
                ", name='" + name + '\'' +
                "description ='"+ description + '\''+
                '}';
    }


}
