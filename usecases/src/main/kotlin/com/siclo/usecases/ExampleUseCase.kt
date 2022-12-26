package com.siclo.usecases

import com.siclo.data.network.repository.ExampleRepository
import com.siclo.domain.network.models.LoginModel
import javax.inject.Inject

class ExampleUseCase @Inject constructor(private val exampleRepository: ExampleRepository) {

    operator fun invoke(): LoginModel {
        return exampleRepository.getLogin()
    }
}