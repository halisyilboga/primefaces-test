package org.primefaces.test;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named("dtBasicView")
@RequestScoped
public class BasicView implements Serializable {

    private List<Product>  products;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        this.products = this.service.getProducts(100);
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setService(final ProductService service) {
        this.service = service;
    }
}