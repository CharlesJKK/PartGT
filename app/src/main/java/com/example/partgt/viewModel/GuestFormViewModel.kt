package com.example.partgt.viewModel

import androidx.lifecycle.ViewModel
import com.example.partgt.repository.GuestRepository

class GuestFormViewModel : ViewModel() {

    private val repository = GuestRepository.getInstance()



}