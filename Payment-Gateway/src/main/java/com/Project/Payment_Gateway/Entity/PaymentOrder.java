package com.Project.Payment_Gateway.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table
public class PaymentOrder {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private Double amount;
    private String service;
    private String orderId;
    private String paymentId;
    private String status;
    private LocalDate createdAt;

    public PaymentOrder(){

    }

    public PaymentOrder(Double amount, LocalDate createdAt, String email, String id, String name, String orderId, String paymentId, String phone, String service, String status) {
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
