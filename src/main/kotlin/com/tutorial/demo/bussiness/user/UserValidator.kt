package com.tutorial.demo.bussiness.user

import com.tutorial.demo.model.user.UserEntity
import org.springframework.stereotype.Component
import java.util.*
@Component
class UserValidator {

    @Throws(Exception::class)
    fun validateUser(optionalUser: Optional<UserEntity>,attributeValidator: String){
        if (!optionalUser.isEmpty){
            throw Exception("$attributeValidator is exist!!")
        }
    }

}