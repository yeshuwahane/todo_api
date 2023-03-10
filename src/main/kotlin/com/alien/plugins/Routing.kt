package com.alien.plugins

import com.alien.routes.todoRouting
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    routing {
        todoRouting()
    }
}
