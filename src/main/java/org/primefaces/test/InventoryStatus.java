package org.primefaces.test;

public enum InventoryStatus {
    INSTOCK("In Stock"), OUTOFSTOCK("Out of Stock"), LOWSTOCK("Low Stock");

    private String text;

    InventoryStatus(final String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }
}