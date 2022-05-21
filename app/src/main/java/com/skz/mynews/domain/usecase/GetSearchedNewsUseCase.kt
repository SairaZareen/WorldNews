package com.skz.mynews.domain.usecase

import com.skz.mynews.data.model.APIResponse
import com.skz.mynews.data.util.Resource
import com.skz.mynews.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(country : String,searchQuery : String,page : Int) : Resource<APIResponse>{
        return newsRepository.getSearchedNews(country,searchQuery,page)
    }
}