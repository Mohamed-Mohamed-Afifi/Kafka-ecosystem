package com.ecomm.service.confimation;

import com.ecomm.service.payment.Payment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ConfirmOrder {
    private final Payment payment;

    ConfirmOrder(@Qualifier("cashPayment") Payment visePayment){
        this.payment=visePayment;
    }
    public void doPayment(){
        payment.pay();
    }
}
