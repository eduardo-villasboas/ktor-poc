package com.bootstrap.service.infrastructure.framework.controllers

import com.bootstrap.service.application.Customer
import com.bootstrap.service.application.CustomerCrudUseCases
import org.springframework.stereotype.Controller

@Controller
class CustomerController(private val customerCrudUseCases: CustomerCrudUseCases) {
    fun findCustomer(): List<Customer> =
        customerCrudUseCases.findCustomer()

}