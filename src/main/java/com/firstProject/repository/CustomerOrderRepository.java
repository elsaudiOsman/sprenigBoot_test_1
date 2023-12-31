package com.firstProject.repository;

import com.firstProject.model.CustomerOrder;

import java.util.List;

public interface CustomerOrderRepository {
    void createCustomerOrder(CustomerOrder customerOrder);
    void updateCustomerOrderById(CustomerOrder customerOrder);
    void deleteCustomerOrderById(Long id);
    CustomerOrder getCustomerOrderById(Long id);
    List<CustomerOrder> getAllCustomerOrdersByCustomerId(Long customerId);
}
