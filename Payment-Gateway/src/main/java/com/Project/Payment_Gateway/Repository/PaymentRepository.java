package com.Project.Payment_Gateway.Repository;

import com.Project.Payment_Gateway.Entity.PaymentOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentOrder,Long> {

    PaymentOrder findByOrderId(String orderId);
}
