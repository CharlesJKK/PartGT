package com.example.partgt.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.partgt.model.GuestModel
import com.example.partgt.repository.GuestRepository

class GuestFormViewModel(application: Application) : AndroidViewModel(application) {

    private val repository = GuestRepository.getInstance(application)

    fun insert(guestModel: GuestModel){
        repository.insert(guestModel)
    }

}