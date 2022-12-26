package com.siclo.data.network.repository

import com.siclo.data.service.ExampleService
import com.siclo.domain.network.models.LoginModel
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(private val exampleService: ExampleService) : ExampleRepository {
    //This should be a suspend function as follows
    /*
    * override suspend fun getLogin(): LoginModel {
    *   return exampleService.call() as LoginModel
    *}
    * */
    override fun getLogin(): LoginModel {
        return exampleService.call() as LoginModel
    }
}