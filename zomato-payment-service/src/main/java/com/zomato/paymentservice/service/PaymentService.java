package com.zomato.paymentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.paymentservice.dto.PaymentDto;
import com.zomato.paymentservice.entities.Payment;
import com.zomato.paymentservice.repositories.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
	
	public Integer pay(PaymentDto paymentDto) {
		
		Payment payment = new Payment();
		payment.setOrderId(paymentDto.getOrderId());
		payment.setAmount(paymentDto.getAmount());
		
		if(paymentDto.getOrderId()/2==0) {
			payment.setStatus("S");//success
		}else {
			payment.setStatus("E");//error
		}
		
		payment = paymentRepository.save(payment);
		return payment.getId();
	}
}
