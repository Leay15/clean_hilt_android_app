package com.siclo.data.di

import com.siclo.data.network.repository.ExampleRepository
import com.siclo.data.network.repository.ExampleRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
class RepositoryModule {

    @Provides
    fun provideExampleRepository(exampleRepositoryImpl: ExampleRepositoryImpl): ExampleRepository =
        exampleRepositoryImpl

}