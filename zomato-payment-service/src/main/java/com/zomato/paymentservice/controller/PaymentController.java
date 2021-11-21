package com.zomato.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zomato.paymentservice.dto.PaymentDto;
import com.zomato.paymentservice.service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@RequestMapping( method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Integer pay(@RequestBody PaymentDto paymentDto) {
		Integer paymentId = paymentService.pay(paymentDto);
		return paymentId;
	}
}
