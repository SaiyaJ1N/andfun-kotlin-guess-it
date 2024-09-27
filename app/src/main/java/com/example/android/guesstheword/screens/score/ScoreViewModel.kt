package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int): ViewModel() {
    private var _score = MutableLiveData<Int>()
    val score : LiveData<Int>
        get() = _score

    private var _eventGameRestart = MutableLiveData<Boolean>()
    val eventGameRestart : LiveData<Boolean>
        get() = _eventGameRestart

    init {
        _score.value = finalScore
    }

    fun onGameRestart() {
        _eventGameRestart.value = true
    }

    fun onGameRestartFinished() {
        _eventGameRestart.value = false
    }
}