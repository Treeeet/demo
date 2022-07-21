package com.tutorial.demo.repository

import com.tutorial.demo.model.user.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository: JpaRepository<UserEntity, Int>{
    fun findByEmail(email: String): Optional<UserEntity>
    fun findByUserName(name: String): Optional<UserEntity>

}