package dev.sergiobelda.foundry.domain.usecase

import dev.sergiobelda.foundry.domain.repository.IFontRepository

class FetchFontsUseCase(
    private val fontRepository: IFontRepository
) {

    suspend operator fun invoke() {
        fontRepository.fetchFonts()
    }
}
