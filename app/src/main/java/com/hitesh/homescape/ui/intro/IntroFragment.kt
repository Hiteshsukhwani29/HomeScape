package com.hitesh.homescape.ui.intro

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import com.hitesh.homescape.R
import com.hitesh.homescape.databinding.BindIntro

class IntroFragment : Fragment() {

    companion object {
        fun newInstance() = IntroFragment()
    }

    private var binding: BindIntro? = null

    private lateinit var viewModel: IntroViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate(inflater, R.layout.fragment_intro, container, false)
        return binding?.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(IntroViewModel::class.java)
        // TODO: Use the ViewModel
    }

}