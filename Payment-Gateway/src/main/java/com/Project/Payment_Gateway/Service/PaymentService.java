package com.Project.Payment_Gateway.Service;

import com.Project.Payment_Gateway.Entity.PaymentOrder;
import com.Project.Payment_Gateway.Repository.PaymentRepository;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
public class PaymentService {

    @Value("{razorpay.key_id}")
    private String keyId;
    @Value("{razorpay.key_secret}")
    private String keySecret;

    @Autowired
    private PaymentRepository paymentRepository;

    private String createOrder(PaymentOrder orderDetails) throws RazorpayException {
        RazorpayClient client = new RazorpayClient(keyId , keySecret);

        //json creation
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount" , orderDetails.getAmount()*100);
        orderRequest.put("Currency" , "INR");
        orderRequest.put("receipt" , "txn_"+ UUID.randomUUID());

        Order razorpayOrder = client.orders.create(orderRequest);

        //this may create your payment , call directly get to razorpay
        System.out.println(razorpayOrder.toString());
        orderDetails.setOrderId(razorpayOrder.get("id"));
        orderDetails.setStatus("CREATED");
        orderDetails.setCreatedAt(LocalDate.now());

        paymentRepository.save(orderDetails);
        return razorpayOrder.toString();
    }
}
