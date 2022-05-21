package com.skz.mynews.domain.usecase

import com.skz.mynews.data.model.APIResponse
import com.skz.mynews.data.util.Resource
import com.skz.mynews.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {

    suspend fun execute(country : String,page:Int): Resource<APIResponse>{
        return newsRepository.getNewsHeadlines(country,page)
    }
}