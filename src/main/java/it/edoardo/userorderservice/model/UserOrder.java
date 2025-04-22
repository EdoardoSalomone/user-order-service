package it.edoardo.userorderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user_orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userOrderId;

    @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private String adminOrderId;

    private LocalDate orderDate;

    @OneToMany(mappedBy = "userOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserOrderItem> items;
}
