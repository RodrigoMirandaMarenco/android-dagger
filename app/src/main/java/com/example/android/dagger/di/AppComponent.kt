package com.example.android.dagger.di

import android.content.Context
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import dagger.BindsInstance
import dagger.Component

/**
 * Created by rodrigomiranda on 7/28/20.
 */
@Component(modules = [StorageModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(activity: RegistrationActivity)
    fun inject(activity: MainActivity)
}