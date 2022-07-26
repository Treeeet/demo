package com.tutorial.demo.controller

import com.tutorial.demo.convertor.FooConverter
import com.tutorial.demo.model.foo.FooEntity
import com.tutorial.demo.model.foo.Response.FooGetResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.tutorial.demo.repository.FooRepository

@RestController
@RequestMapping("api/tutorial")
class FooController(
    private val fooConverter: FooConverter,
    private val fooRepository: FooRepository
    ) {

    @GetMapping("/foo")
    fun fooGet(): List<FooGetResponse> {
        val fooEntities: List<FooEntity> = fooRepository.findAll()
        return fooConverter.createGetResponses(fooEntities)
    }



}