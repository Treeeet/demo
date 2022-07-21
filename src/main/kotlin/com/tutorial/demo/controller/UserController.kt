package com.tutorial.demo.controller

import com.tutorial.demo.bussiness.user.UserValidator
import com.tutorial.demo.convertor.UserConverter
import com.tutorial.demo.model.user.Request.CreateUserRequest
import com.tutorial.demo.model.user.Response.GetUserResponse
import com.tutorial.demo.model.user.UserEntity
import com.tutorial.demo.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
class UserController(
    private val userRepository: UserRepository,
    private val userConverter: UserConverter,
    private val userValidator: UserValidator,
    private val USER_NAME: String = "username",
    private val EMAIL: String = "email"
) {

    @PostMapping("api/tutorial/user")
    fun createUser(@Valid @RequestBody request: CreateUserRequest): String{
        var optionalUser: Optional<UserEntity>  = userRepository.findByEmail(request.email)
        userValidator.validateUser(optionalUser,EMAIL)
        optionalUser  = userRepository.findByUserName(request.userName)
        userValidator.validateUser(optionalUser,USER_NAME);
        var user: UserEntity = userConverter.requestToEntity(request)
        userRepository.save(user)
        return "Create user: ${user.userName} success"
    }

    @GetMapping("api/tutorial/user")
    fun getUsers(): List<GetUserResponse> {
        val users: List<UserEntity> = userRepository.findAll()
        return userConverter.createUserResponses(users)
    }
}