package com.tw.apistack.domain.customer;

/**
 * Created by jxzhong on 2017/7/17.
 */

import java.util.List;

import com.tw.apistack.domain.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
