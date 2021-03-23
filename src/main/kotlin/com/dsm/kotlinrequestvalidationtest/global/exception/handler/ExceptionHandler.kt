package com.dsm.kotlinrequestvalidationtest.global.exception.handler

import com.dsm.kotlinrequestvalidationtest.global.exception.response.ExceptionResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ExceptionHandler {

//    @ExceptionHandler(RuntimeException::class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    fun runtimeExceptionHandler(e: Exception) {
//        e.printStackTrace()
//        return
//            ExceptionResponse(
//                code = "INTERNAL_SERVER_ERROR",
//                message = "500에러",
//            )
//    }
}