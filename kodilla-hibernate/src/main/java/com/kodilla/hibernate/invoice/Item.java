package com.kodilla.hibernate.invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
public final class Item {
    int id;
    Product product;
    BigDecimal price;
    int quantity;
    BigDecimal value;

    public Item(){

    }
    public Item(BigDecimal price, int quantity, BigDecimal value){
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT")
    public Product getProduct() {
        return product;
    }
    @Column(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @Column(name = "QUANTITY")
    public int getQuantity() {
        return quantity;
    }
    @Column(name = "VALUE")
    public BigDecimal getValue() {
        return value;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
