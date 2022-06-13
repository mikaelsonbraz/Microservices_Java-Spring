package com.mikaelsonbraz.hrpayroll.services;

import com.mikaelsonbraz.hrpayroll.entities.Payment;
import com.mikaelsonbraz.hrpayroll.entities.Worker;
import com.mikaelsonbraz.hrpayroll.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, Integer days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
