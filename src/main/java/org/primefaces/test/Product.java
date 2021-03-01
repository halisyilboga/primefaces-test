package org.primefaces.test;

import java.io.Serializable;
import java.util.List;

public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    private int               id;

    private String            code;

    private String            name;

    private String            description;

    private String            image;

    private double            price;

    private String            category;

    private int               quantity;

    private InventoryStatus   inventoryStatus;

    private int               rating;

    private List<Order>       orders;

    public Product() {
    }

    public Product(final int id,
                   final String code,
                   final String name,
                   final String description,
                   final String image,
                   final double price,
                   final String category,
                   final int quantity,
                   final InventoryStatus inventoryStatus,
                   final int rating) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.image = image;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.inventoryStatus = inventoryStatus;
        this.rating = rating;
    }

    @Override
    public Product clone() {
        return new Product(this.getId(),
                           this.getCode(),
                           this.getName(),
                           this.getDescription(),
                           this.getImage(),
                           this.getPrice(),
                           this.getCategory(),
                           this.getQuantity(),
                           this.getInventoryStatus(),
                           this.getRating());
    }

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(final String image) {
        this.image = image;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(final String category) {
        this.category = category;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(final int quantity) {
        this.quantity = quantity;
    }

    public InventoryStatus getInventoryStatus() {
        return this.inventoryStatus;
    }

    public void setInventoryStatus(final InventoryStatus inventoryStatus) {
        this.inventoryStatus = inventoryStatus;
    }

    public int getRating() {
        return this.rating;
    }

    public void setRating(final int rating) {
        this.rating = rating;
    }

    public List<Order> getOrders() {
        return this.orders;
    }

    public void setOrders(final List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = (prime * result) + ((this.code == null) ? 0 : this.code.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        final Product other = (Product) obj;
        if (this.code == null) {
            return other.code == null;
        } else {
            return this.code.equals(other.code);
        }
    }

}