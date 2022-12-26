package com.siclo.data.service

import com.siclo.domain.network.models.LoginModel

class ExampleServiceImpl : ExampleService {
    override fun call(): Any {
        return LoginModel()
    }
}