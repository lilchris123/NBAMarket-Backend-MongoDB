package com.nba.service;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nba.dto.OrderDTO;
import com.nba.mapper.NbaMapper;
import com.nba.model.Order;
import com.nba.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	NbaMapper nbaMapper;
	
	public Set<OrderDTO> getAllOrders(){
		return orderRepository.findAll().stream().map(o -> nbaMapper.toDto(o)).collect(Collectors.toSet());
	}
	public Set<OrderDTO> getUserOrders(String userId){
		return orderRepository.findAllByUserId(userId).stream().map(o-> nbaMapper.toDto(o)).collect(Collectors.toSet());
	}
	public void placeOrder(Order order) {
		orderRepository.save(order);
	}
	public Order getOrder(String OrderId) {
		return orderRepository.findById(OrderId).get();
	}
	public void changeOrder(Order order) {
		orderRepository.save(order);
	}
	public void patchOrder(Order order) {
		Order orderToUpd= orderRepository.findById(order.getOrderId()).get();
		orderToUpd.setShipped(order.isShipped());
		orderRepository.save(orderToUpd);
	}
	public void deleteOrder(String orderId) {
		orderRepository.deleteById(orderId);
	}
}
