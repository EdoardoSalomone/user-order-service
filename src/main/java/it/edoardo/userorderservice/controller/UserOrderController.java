package it.edoardo.userorderservice.controller;

import it.edoardo.userorderservice.model.UserOrder;
import it.edoardo.userorderservice.service.UserOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-orders")
@RequiredArgsConstructor
public class UserOrderController {

    private UserOrderService userOrderService;

    @PostMapping
    public ResponseEntity<UserOrder> createOrder(@RequestBody UserOrder userOrder) {
        UserOrder saved = userOrderService.saveOrder(userOrder);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public List<UserOrder> getAllOrders() {
        return userOrderService.getAllOrders();
    }

    @GetMapping("/user/{userId}")
    public List<UserOrder> getOrdersByUser(@PathVariable Integer userId) {
        return userOrderService.getOrderByUserId(userId);
    }
}
