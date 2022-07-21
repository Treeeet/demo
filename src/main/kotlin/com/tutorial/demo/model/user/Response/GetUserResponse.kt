package com.tutorial.demo.model.user.Response



data class GetUserResponse constructor(
    var userName: String,
    var email: String,
    var password: String
)

