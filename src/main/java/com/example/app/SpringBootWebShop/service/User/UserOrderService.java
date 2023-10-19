package com.example.app.SpringBootWebShop.service.User;

import com.example.app.SpringBootWebShop.entity.Order;
import com.example.app.SpringBootWebShop.repository.OrderRepository;
import com.example.app.SpringBootWebShop.utils.StringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrderService {
    @Autowired
    OrderRepository repository;

    public String makeOrder(String[] data) {
        String orderCode = StringGenerator.genStr();
        Order order = new Order();
        order.setUserName(data[0]);
        order.setUserPhone(data[1]);
        order.setUserEmail(data[2]);
        order.setContent(data[3]);
        order.setOrderCode(orderCode);
        repository.save(order);
        return orderCode;
    }
}
