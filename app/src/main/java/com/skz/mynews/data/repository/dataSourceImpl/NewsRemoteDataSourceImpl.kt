package com.skz.mynews.data.repository.dataSourceImpl

import com.skz.mynews.data.api.NewsAPIService
import com.skz.mynews.data.model.APIResponse
import com.skz.mynews.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,

):NewsRemoteDataSource {
    override suspend fun getTopHeadlines(country : String,page:Int): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country,page)
    }

    override suspend fun getSearchedNews(
        country: String,
        searchQuery: String,
        page: Int
    ): Response<APIResponse> {
        return newsAPIService.getSearchedTopHeadlines(country,searchQuery,page)
    }
}