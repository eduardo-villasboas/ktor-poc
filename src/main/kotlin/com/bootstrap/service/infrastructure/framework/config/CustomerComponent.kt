package com.bootstrap.service.infrastructure.framework.config

import com.bootstrap.service.application.CustomerCrudUseCases
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class CustomerComponent {

    @Bean
    fun customer(): CustomerCrudUseCases = CustomerCrudUseCases()

}