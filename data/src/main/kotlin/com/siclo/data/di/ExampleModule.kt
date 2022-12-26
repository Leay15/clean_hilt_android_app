package com.siclo.data.di

import com.siclo.data.service.ExampleService
import com.siclo.data.service.ExampleServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class ExampleModule {

    @Singleton
    @Provides
    fun provicesExampleServiceImpl() : ExampleServiceImpl = ExampleServiceImpl()

    @Singleton
    @Provides
    fun providesExampleService(exampleServiceImpl: ExampleServiceImpl) : ExampleService = exampleServiceImpl
}