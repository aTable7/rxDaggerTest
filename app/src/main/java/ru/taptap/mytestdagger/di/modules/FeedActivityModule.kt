package ru.taptap.mytestdagger.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, NetworkModule::class])
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindApplicationContext(application: Application): Context

    @Binds
    abstract fun bindFeedRepository(repository: FeedDataRepository): FeedRepository
}
