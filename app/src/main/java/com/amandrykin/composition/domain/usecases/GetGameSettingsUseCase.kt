package com.amandrykin.composition.domain.usecases

import com.amandrykin.composition.domain.entity.GameSettings
import com.amandrykin.composition.domain.entity.Level
import com.amandrykin.composition.domain.repository.GameRepository

class GetGameSettingsUseCase (
    private val repository: GameRepository
) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}