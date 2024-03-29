package com.ict.mito.mvvm_sample_kotlin

import androidx.lifecycle.ViewModel

/**
 * Created by mitohato14 on 2019-07-17.
 */

// ViewModel
class MainViewModel : ViewModel() {
    private val repository: Repository = Repository()

    fun message(): String {
        return repository.getMessage()
    }
}