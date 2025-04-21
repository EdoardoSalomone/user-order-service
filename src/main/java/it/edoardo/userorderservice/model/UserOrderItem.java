package it.edoardo.userorderservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_order_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer adminOrderProductId;

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "user_order_items")
    private UserOrder order;
}
