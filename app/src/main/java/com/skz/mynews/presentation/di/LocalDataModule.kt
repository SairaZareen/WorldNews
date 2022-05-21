package com.skz.mynews.presentation.di

import com.skz.mynews.data.db.ArticleDAO
import com.skz.mynews.data.repository.dataSource.NewsLocalDataSource
import com.skz.mynews.data.repository.dataSourceImpl.NewsLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {

    @Singleton
    @Provides
    fun provideLocalDataSource(articleDAO: ArticleDAO):NewsLocalDataSource{
        return NewsLocalDataSourceImpl(articleDAO)
    }
}