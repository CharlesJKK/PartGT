package com.example.partgt.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.example.partgt.GuestModel
import com.example.partgt.R
import com.example.partgt.databinding.ActivityGuestFormBinding
import com.example.partgt.viewModel.GuestFormViewModel

class GuestFormActivity : AppCompatActivity(), View.OnClickListener {

    private  lateinit var  binding: ActivityGuestFormBinding
    private  lateinit var viewModel: GuestFormViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuestFormBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(this).get(GuestFormViewModel::class.java)

        binding.buttonSave.setOnClickListener(this)
        binding.radioPresent.isChecked = true
    }

    override fun onClick(v: View) {
        if(v.id == R.id.button_save){
            //GuestModel(10, "x", false)
        }
    }
}