package com.amandrykin.composition.domain.repository

import com.amandrykin.composition.domain.entity.GameSettings
import com.amandrykin.composition.domain.entity.Level
import com.amandrykin.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}