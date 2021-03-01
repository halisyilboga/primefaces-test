package org.primefaces.test;

public class Order implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private final int         number;
    private final String      imagePath;

    public Order(final int number, final String imagePath) {
        this.number = number;
        this.imagePath = imagePath;
    }

    public int getNumber() {
        return this.number;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (this.getClass() != o.getClass())) {
            return false;
        }

        final Order order = (Order) o;

        return this.number == order.number;
    }

    @Override
    public int hashCode() {
        return this.number;
    }

}