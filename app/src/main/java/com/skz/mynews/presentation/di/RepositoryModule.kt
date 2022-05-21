package com.skz.mynews.presentation.di

import com.skz.mynews.data.repository.NewsRepositoryImpl
import com.skz.mynews.data.repository.dataSource.NewsLocalDataSource
import com.skz.mynews.data.repository.dataSource.NewsRemoteDataSource
import com.skz.mynews.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource,newsLocalDataSource: NewsLocalDataSource):NewsRepository{
        return NewsRepositoryImpl(newsRemoteDataSource,newsLocalDataSource)
    }
}