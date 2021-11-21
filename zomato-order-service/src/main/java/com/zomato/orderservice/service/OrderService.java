package com.zomato.orderservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.orderservice.dto.OrderDto;
import com.zomato.orderservice.entities.Order;
import com.zomato.orderservice.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	Random rand = new Random();
	
	public Integer order(OrderDto orderDto) {
		Order order = new Order();
		order.setItemName(orderDto.getItemName());
		order.setAmt(orderDto.getAmount());
		order.setStatus(orderDto.getEnabled());
		//order.setOrderId(rand.nextInt(1000));
		order = orderRepository.save(order);
		return order.getOrderId();
		
	}
}
