package com.bootstrap.service.infrastructure.framework

import com.bootstrap.service.infrastructure.framework.controllers.CustomerController
import com.bootstrap.service.infrastructure.framework.plugins.configureRouting
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import org.springframework.context.annotation.AnnotationConfigApplicationContext

lateinit var context: AnnotationConfigApplicationContext

fun main() {
    context = AnnotationConfigApplicationContext("com.bootstrap.service.infrastructure.framework")
    embeddedServer(Netty, port = 8888, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting(context.getBean(CustomerController::class.java))
}
