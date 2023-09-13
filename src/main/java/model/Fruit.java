package model;

import java.util.Objects;

public class Fruit {
    private String operation;
    private String name;
    private int quantity;

    public Fruit(String operation, String name, int quantity) {
        this.operation = operation;
        this.name = name;
        this.quantity = quantity;
    }

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getOperation() {
        return operation;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) o;
        return quantity == fruit.quantity && operation == fruit.operation
                && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operation, name, quantity);
    }

    @Override
    public String toString() {
        return "Fruit{"
                + "operation='" + operation + '\''
                + ", name='" + name + '\''
                + ", quantity=" + quantity
                + '}';
    }
}
