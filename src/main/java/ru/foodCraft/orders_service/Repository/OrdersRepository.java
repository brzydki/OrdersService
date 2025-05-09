package ru.foodCraft.orders_service.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.foodCraft.orders_service.Model.Order;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Order, Long> {

    Optional<Order> findOrderById(Long Id);

    Optional<Order> findByCustomerIdAndChiefIdAndTotalPrice(Long customerId, Long chiefId, double totalPrice);
}
