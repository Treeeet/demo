package com.tutorial.demo.convertor

import com.tutorial.demo.model.user.Request.CreateUserRequest
import com.tutorial.demo.model.user.Response.GetUserResponse
import com.tutorial.demo.model.user.UserEntity
import org.springframework.stereotype.Component

@Component
class UserConverter {

    fun createUserResponses(userEntities: List<UserEntity>): List<GetUserResponse>{
        var result: ArrayList<GetUserResponse> = arrayListOf()
        for (userEntity in userEntities){
            result.add(createUserResponse(userEntity))
        }
        return result
    }

    fun createUserResponse(userEntity: UserEntity): GetUserResponse{
        return GetUserResponse(userEntity.userName,userEntity.email,userEntity.password)
    }

    fun requestToEntity(request: CreateUserRequest): UserEntity{
        var result = UserEntity()
        result.email = request.email
        result.userName = request.userName
        result.password = request.password
        result.isActivated = false
        return result
    }

}