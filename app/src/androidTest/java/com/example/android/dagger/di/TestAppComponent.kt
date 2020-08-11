package com.example.android.dagger.di

import dagger.Component

/**
 * Created by rodrigomiranda on 8/11/20.
 */
@Component(modules = [TestStorageModule::class, AppSubComponents::class])
interface TestAppComponent : AppComponent