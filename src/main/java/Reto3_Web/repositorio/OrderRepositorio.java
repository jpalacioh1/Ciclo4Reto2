package Reto3_Web.repositorio;

import Reto3_Web.interfaces.InterfaceOrder;
import Reto3_Web.modelo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class OrderRepositorio {
    @Autowired
    private InterfaceOrder orderCrudRepository;

    public List<Order> getAll(){
        return orderCrudRepository.findAll();    
    }

    public Optional<Order> getOrder(Integer id){
        return orderCrudRepository.findById(id);
    }
    
    public Order create(Order order){
        return orderCrudRepository.save(order);
    }
    
    public void update(Order order){
        orderCrudRepository.save(order);
    }
    
    public void delete(Order order){
        orderCrudRepository.delete(order);
    }
    
    public List<Order> getOrderByZone(String zone){
        return orderCrudRepository.findBySalesManZone(zone);
    }
}

