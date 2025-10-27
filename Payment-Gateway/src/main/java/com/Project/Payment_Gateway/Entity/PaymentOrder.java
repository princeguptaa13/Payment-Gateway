package com.Project.Payment_Gateway.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "payment_orders")
public class PaymentOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Double amount;
    private String service;
    private String orderId;
    private String paymentId;
    private String status;
    @Column(name = "created_at")
    private LocalDate createdAt;

    public PaymentOrder(){

    }

    public PaymentOrder(Double amount, LocalDate createdAt, String email, Long id, String name, String orderId, String paymentId, String phone, String service, String status) {
        this.amount = amount;
        this.createdAt = createdAt;
        this.email = email;
        this.id = id;
        this.name = name;
        this.orderId = orderId;
        this.paymentId = paymentId;
        this.phone = phone;
        this.service = service;
        this.status = status;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
