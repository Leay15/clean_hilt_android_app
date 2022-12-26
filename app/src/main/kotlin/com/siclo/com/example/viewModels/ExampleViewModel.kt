package com.siclo.com.example.viewModels

import androidx.lifecycle.ViewModel
import com.siclo.usecases.ExampleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExampleViewModel @Inject constructor(private var exampleUseCase: ExampleUseCase) : ViewModel() {

}