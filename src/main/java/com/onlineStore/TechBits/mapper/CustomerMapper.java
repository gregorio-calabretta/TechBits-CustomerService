package com.onlineStore.TechBits.mapper;

import com.onlineStore.TechBits.domain.Customer;
import com.onlineStore.TechBits.dtos.CustomerDtoResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CustomerMapper {
    public static CustomerDtoResponse map(Customer customer){
        return CustomerDtoResponse.builder().
                id(customer.getId()).
                name(customer.getName()).
                email(customer.getEmail()).build();
    }
    public static List<CustomerDtoResponse> mapAll(List<Customer> customerList){
        return customerList.stream()
                .map(CustomerMapper::map)
                .collect(Collectors.toList());
    }
}
