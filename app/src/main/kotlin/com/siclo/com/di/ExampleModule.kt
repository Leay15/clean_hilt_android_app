package com.siclo.com.di

import com.siclo.data.network.repository.ExampleRepository
import com.siclo.data.network.repository.ExampleRepositoryImpl
import com.siclo.usecases.ExampleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@InstallIn(ActivityComponent::class)
@Module
class ExampleModule {

    @Provides
    fun provideExampleUseCase(exampleRepository: ExampleRepository): ExampleUseCase =
        ExampleUseCase(exampleRepository)
}