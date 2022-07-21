package com.tutorial.demo.repository

import com.tutorial.demo.model.foo.FooEntity
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface FooRepository: JpaRepository<FooEntity, Int>{
    fun findByName(name: String): Optional<FooEntity>
}