package com.tutorial.demo.convertor

import com.tutorial.demo.model.foo.FooEntity
import com.tutorial.demo.model.foo.Response.FooGetResponse
import org.springframework.stereotype.Component

@Component
class FooConverter {

    fun createGetResponses(fooEntities: List<FooEntity>): List<FooGetResponse> {
        var result : ArrayList<FooGetResponse> = arrayListOf();
        for (fooEntity in fooEntities){
            result.add(createGetResponse(fooEntity))
        }
        return result
    }

    fun createGetResponse(fooEntity: FooEntity): FooGetResponse {
        return FooGetResponse(fooEntity.id,fooEntity.name,fooEntity.description,fooEntity.quantitiy);
    }
}