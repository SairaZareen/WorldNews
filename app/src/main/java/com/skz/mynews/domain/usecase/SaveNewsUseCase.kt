package com.skz.mynews.domain.usecase

import com.skz.mynews.data.model.Article
import com.skz.mynews.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}