package com.skz.mynews.data.repository.dataSourceImpl

import com.skz.mynews.data.db.ArticleDAO
import com.skz.mynews.data.model.Article
import com.skz.mynews.data.repository.dataSource.NewsLocalDataSource
import kotlinx.coroutines.flow.Flow

class NewsLocalDataSourceImpl(private val articleDAO: ArticleDAO) : NewsLocalDataSource {
    override suspend fun saveArticleToDB(article: Article) {
        articleDAO.insert(article)
    }

    override fun getSavedArticles(): Flow<List<Article>> {
       return articleDAO.getAllArticles()
    }

    override suspend fun deleteArticleFromDB(article: Article) {
        return articleDAO.deleteArticle(article)
    }
}