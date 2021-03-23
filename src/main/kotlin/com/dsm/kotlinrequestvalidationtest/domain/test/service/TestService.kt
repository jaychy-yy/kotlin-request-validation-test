package com.dsm.kotlinrequestvalidationtest.domain.test.service

import org.springframework.stereotype.Service

@Service
class TestService {

    fun test(
        pathVariable: String,
        requestParam: String,
        requestBodyString: String,
        requestBodyInt: Int,
    ) {

        println("Path Variable: $pathVariable")
        println("Request Param: $requestParam")
        println("Request Body String: $requestBodyString")
        println("Request Body Int: $requestBodyInt")
        println()
    }
}