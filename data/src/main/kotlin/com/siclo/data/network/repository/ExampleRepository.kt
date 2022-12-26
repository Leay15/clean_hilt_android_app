package com.siclo.data.network.repository

import com.siclo.domain.network.models.LoginModel

interface ExampleRepository {

    fun getLogin() : LoginModel
}