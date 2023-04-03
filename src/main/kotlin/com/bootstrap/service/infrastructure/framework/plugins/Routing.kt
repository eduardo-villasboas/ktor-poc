package com.bootstrap.service.infrastructure.framework.plugins

import com.bootstrap.service.infrastructure.framework.controllers.CustomerController
import io.ktor.http.*
import io.ktor.serialization.jackson.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(customerController: CustomerController) {

    routing {
        install(ContentNegotiation) {
            register(ContentType.Application.Json, JacksonConverter())
        }
        get("/") {

            call.respond(customerController.findCustomer())
            //call.respondText("Hello World! ${}")
        }
    }
}
