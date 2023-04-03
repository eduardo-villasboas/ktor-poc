package com.bootstrap.service.infrastructure.framework.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureHTTP() {
    routing {
        //swaggerUI(path = "openapi")
    }
}
