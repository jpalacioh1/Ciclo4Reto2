package Reto3_Web.interfaces;

import Reto3_Web.modelo.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceOrder extends MongoRepository<Order, Integer> {
    List<Order> findBySalesManZone(String zone); 
}
