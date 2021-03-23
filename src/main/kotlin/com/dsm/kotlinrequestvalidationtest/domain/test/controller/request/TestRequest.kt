package com.dsm.kotlinrequestvalidationtest.domain.test.controller.request

import javax.validation.Valid
import javax.validation.constraints.Positive
import javax.validation.constraints.NotBlank

data class TestRequest(
    @get:NotBlank(message = "<NULL> <EMPTY> <BLANK>")
    val a: String,
    @get:Valid
    val b: B,
) {

    data class B(
        @get:Positive(message = "<양수가 아님>")
        val c: Int,
    )
}