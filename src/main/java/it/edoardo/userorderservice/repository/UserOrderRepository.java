package it.edoardo.userorderservice.repository;

import it.edoardo.userorderservice.model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserOrderRepository extends JpaRepository<UserOrder,String> {

    List<UserOrder> findByUserId(Integer userId);

    List<UserOrder> findByAdminOrderId(String adminOrderId);
}
