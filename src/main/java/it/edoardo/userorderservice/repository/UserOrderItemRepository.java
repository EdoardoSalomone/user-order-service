package it.edoardo.userorderservice.repository;

import it.edoardo.userorderservice.model.UserOrder;
import it.edoardo.userorderservice.model.UserOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserOrderItemRepository extends JpaRepository<UserOrderItem,Integer> {

    List<UserOrderItem> findByUserOrder_UserOrderId(String userOrderId);
}
