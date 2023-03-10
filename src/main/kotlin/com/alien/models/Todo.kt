package com.alien.models

import kotlinx.serialization.Serializable

@Serializable
data class Todo(val id:String,val todoName:String,val description:String)


val todoList = mutableListOf<Todo>()

