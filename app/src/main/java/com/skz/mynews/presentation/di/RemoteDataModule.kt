package com.skz.mynews.presentation.di

import com.skz.mynews.data.api.NewsAPIService
import com.skz.mynews.data.repository.NewsRepositoryImpl
import com.skz.mynews.data.repository.dataSource.NewsRemoteDataSource
import com.skz.mynews.data.repository.dataSourceImpl.NewsRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Singleton
    @Provides
    fun provideNewsRemoteDataSource(newsAPIService: NewsAPIService):NewsRemoteDataSource{
        return NewsRemoteDataSourceImpl(newsAPIService)
    }
}