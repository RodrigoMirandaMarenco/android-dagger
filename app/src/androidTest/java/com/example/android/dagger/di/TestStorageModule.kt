package com.example.android.dagger.di

import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * Created by rodrigomiranda on 8/11/20.
 */
@Module
abstract class TestStorageModule {

    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}