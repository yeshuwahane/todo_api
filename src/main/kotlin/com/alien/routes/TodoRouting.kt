package com.alien.routes

import com.alien.models.Todo
import com.alien.models.todoList
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun Route.todoRouting() {
    route("/todos") {
        get {

            if (todoList.isEmpty()) {
                call.respondText(
                    "Welcome to todo App ****** " + "It's all empty, add some todos!",
                    status = HttpStatusCode.OK
                )
            } else {
                call.respond(todoList)
            }
        }
    }
    route("/todo") {
        get("{id?}") {
            val id =
                call.parameters["id"] ?: return@get call.respondText("Missing id", status = HttpStatusCode.BadRequest)
            val todoId = todoList.find { it.id == id } ?: return@get call.respondText(
                "Invalid id",
                status = HttpStatusCode.NotFound
            )
            call.respond(todoId)
        }
    }
    route("/addtodo") {
        post {
            val todo = call.receive<Todo>()
            todoList.add(todo)
            call.respondText("Todo added Successfully!..", status = HttpStatusCode.Created)
        }
    }
    route("/removetodo") {
        delete("{id?}") {
            val id = call.parameters["id"] ?: return@delete call.respond(HttpStatusCode.BadRequest)
            if (todoList.removeIf { it.id == id }) {
                call.respondText("Todo removed Successfully", status = HttpStatusCode.Accepted)
            } else {
                call.respondText("no Todo found with $id ", status = HttpStatusCode.NotFound)
            }
        }
    }
}