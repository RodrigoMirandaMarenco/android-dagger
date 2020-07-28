package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

/**
 * Created by rodrigomiranda on 7/28/20.
 */
@Component
interface AppComponent {
    fun inject(activity: RegistrationActivity)
}