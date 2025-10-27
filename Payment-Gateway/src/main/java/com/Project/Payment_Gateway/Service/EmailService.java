package com.Project.Payment_Gateway.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String toEmail , String name , String course , double amount){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(toEmail);
        mailMessage.setSubject("Payment has done Successfully - ");
        mailMessage.setText("Hey ! "+name+" , \n"+
                "ThankYou ! For using ESAP !" +
                "Your Payment has done Successfully of "+course+"."+
                "we are looking forward to see you !"+
                "\n\n-ESAP & Team"
                );
        javaMailSender.send(mailMessage);
    }
}
