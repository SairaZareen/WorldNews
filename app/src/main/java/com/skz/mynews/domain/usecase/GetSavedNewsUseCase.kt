package com.skz.mynews.domain.usecase

import com.skz.mynews.data.model.APIResponse
import com.skz.mynews.data.model.Article
import com.skz.mynews.data.util.Resource
import com.skz.mynews.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>>{
       return newsRepository.getSavedNews()
    }
}