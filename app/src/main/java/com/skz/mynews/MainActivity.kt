package com.skz.mynews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.skz.mynews.databinding.ActivityMainBinding
import com.skz.mynews.presentation.adapter.NewsAdapter
import com.skz.mynews.presentation.viewmodel.NewsViewModel
import com.skz.mynews.presentation.viewmodel.NewsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var factory: NewsViewModelFactory
    lateinit var viewModel : NewsViewModel
    @Inject
    lateinit var newsAdapter: NewsAdapter
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
      //  binding.bnvNews.setupWithNavController(fragmentContainerView.findNavController())
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bnvNews.setupWithNavController(
            navController
        )

        viewModel = ViewModelProvider(this,factory).get(NewsViewModel::class.java)
    }
}