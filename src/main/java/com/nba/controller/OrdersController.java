package com.nba.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nba.dto.OrderDTO;
import com.nba.model.Order;
import com.nba.service.OrderService;

@RestController
public class OrdersController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("/api/orders")
	private ResponseEntity<Set<OrderDTO>> getAllOrders(){
		Set<OrderDTO> result= orderService.getAllOrders();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/api/orders/users/{userId}")
	private ResponseEntity<Set<OrderDTO>> getUserOrders(@PathVariable String userId){
		Set<OrderDTO> result= orderService.getUserOrders(userId);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping("/api/orders/{orderId}")
	private ResponseEntity<Order> getOrder(@PathVariable String orderId){
		Order result= orderService.getOrder(orderId);
		return ResponseEntity.ok(result);
	}
	
	@PostMapping("/api/orders")
	private ResponseEntity<Order> placeOrder(@RequestBody Order order) throws URISyntaxException {
		orderService.placeOrder(order);
		return ResponseEntity.created(new URI("/api/orders"+ order.getOrderId())).body(order);
	}
	
	@PutMapping("/api/orders")
	private ResponseEntity<Order> updateOrder(@RequestBody Order order){
		orderService.changeOrder(order);
		return ResponseEntity.ok().body(order);
	}
	
	@PatchMapping("/api/orders")
	private ResponseEntity<Order> patchOrder(@RequestBody Order order){
		orderService.patchOrder(order);
		return ResponseEntity.ok().body(order);
	}
	
	@DeleteMapping("/api/orders/{orderId}")
	private ResponseEntity<Order> deleteOrder(@PathVariable String orderId){
		orderService.deleteOrder(orderId);
		return ResponseEntity.ok().build();
	}
}
