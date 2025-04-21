package it.edoardo.userorderservice.service;

import com.netflix.discovery.converters.Auto;
import it.edoardo.userorderservice.model.UserOrder;
import it.edoardo.userorderservice.repository.UserOrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserOrderService {

    private UserOrderRepository userOrderRepository;

    public UserOrder saveOrder(UserOrder userOrder) {
        return userOrderRepository.save(userOrder);
    }

    public List<UserOrder> getAllOrders() {
        return userOrderRepository.findAll();
    }

    public List<UserOrder> getOrderByUserId(Integer userId) {
        return userOrderRepository.findByUserId(userId);
    }


}
