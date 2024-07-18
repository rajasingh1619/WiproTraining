package com.wipro.task4;

public class InvoiceItemQn {
    private String id;
    private String description;
    private int quantity;
    private double unitPrice;

    public InvoiceItemQn(String id, String description, int quantity, double unitPrice) {
        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return quantity * unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",description=" + description + ",quantity=" + quantity + ",unitPrice=" + unitPrice + "]";
    }
}
