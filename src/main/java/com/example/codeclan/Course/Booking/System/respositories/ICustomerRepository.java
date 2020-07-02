package com.example.codeclan.Course.Booking.System.respositories;

import com.example.codeclan.Course.Booking.System.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Long> {
        List<Customer> findByBookingsCourseName(String name);
}
