package com.skz.mynews.domain.repository

import androidx.lifecycle.LiveData
import com.skz.mynews.data.model.APIResponse
import com.skz.mynews.data.model.Article
import com.skz.mynews.data.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines(country : String,page:Int) : Resource<APIResponse>
    suspend fun getSearchedNews(country:String,searchQuery:String,page: Int): Resource<APIResponse>
    suspend fun saveNews(article: Article)
    suspend fun deleteNews(article: Article)
    fun getSavedNews(): Flow<List<Article>>   // since data stream ,no need to suspend
}