package com.example.android.dagger.di

import dagger.Component
import javax.inject.Singleton

/**
 * Created by rodrigomiranda on 8/11/20.
 */
@Singleton
@Component(modules = [TestStorageModule::class, AppSubComponents::class])
interface TestAppComponent : AppComponent