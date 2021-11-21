package com.zomato.orderservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zomato.orderservice.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
