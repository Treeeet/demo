package com.tutorial.demo.model.user.Request

data class CreateUserRequest constructor(
    var userName: String,
    var email: String,
    var password: String
)


