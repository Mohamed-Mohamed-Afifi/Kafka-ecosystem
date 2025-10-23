package com.ecomm.service.payment;

import org.springframework.stereotype.Service;

@Service
public class VisePayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Visa payment");
    }
}
