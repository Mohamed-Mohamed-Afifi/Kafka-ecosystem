package com.ecomm.service.payment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class CashPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Cash");
    }
}
