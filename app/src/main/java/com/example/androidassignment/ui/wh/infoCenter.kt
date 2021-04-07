package com.example.androidassignment.ui.wh

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidassignment.R

class infoCenter : Fragment() {

    companion object {
        fun newInstance() = infoCenter()
    }

    private lateinit var viewModel: InfoCenterViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.info_center_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoCenterViewModel::class.java)
        // TODO: Use the ViewModel
    }

}