package com.ecomm.config;

import com.ecomm.service.confimation.ConfirmOrder;
import com.ecomm.service.payment.Payment;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class StartupRunner implements CommandLineRunner {
    private final Payment payment;
    @Value("${name}")
    private String myname;
    StartupRunner(@Qualifier("cashPayment") Payment payment){
        this.payment=payment;
    }
    @Override
    public void run(String... args) throws Exception {
     payment.pay();
     System.out.println(myname);
    }
}
