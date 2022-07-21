package com.tutorial.demo.bussiness.foo

import com.tutorial.demo.model.foo.FooEntity
import org.springframework.stereotype.Component
import java.util.*

@Component
class FooValidator {

    @Throws(Exception::class)
    fun validateFoo(fooEntity: Optional<FooEntity>){
        if (!fooEntity.isEmpty){
            throw Exception("Data is exist!!")
        }
    }


}