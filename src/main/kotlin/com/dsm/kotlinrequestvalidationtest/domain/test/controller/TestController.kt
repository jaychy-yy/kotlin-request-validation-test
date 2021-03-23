package com.dsm.kotlinrequestvalidationtest.domain.test.controller

import com.dsm.kotlinrequestvalidationtest.domain.test.controller.request.TestRequest
import com.dsm.kotlinrequestvalidationtest.domain.test.service.TestService
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import javax.validation.Valid
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

@RestController
@Validated
class TestController(
    private val testService: TestService,
) {

    @PostMapping("/test/{test}")
    fun test(
        @NotBlank(message = "<NULL> <EMPTY> <BLANK>")
        @PathVariable("test")
        pathVariable: String,

        @NotBlank(message = "<NULL> <EMPTY> <BLANK>")
        @RequestParam("test")
        requestParam: String,

        @Valid
        @NotNull(message = "<NULL>")
        @RequestBody
        requestBody: TestRequest,

    ) = testService.test(
        pathVariable = pathVariable,
        requestParam = requestParam,
        requestBodyString = requestBody.a,
        requestBodyInt = requestBody.b.c,
    )
}