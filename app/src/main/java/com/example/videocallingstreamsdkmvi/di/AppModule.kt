package com.example.videocallingstreamsdkmvi.di

import com.example.videocallingstreamsdkmvi.VideoCallingApp
import com.example.videocallingstreamsdkmvi.connection.ConnectViewModel
import com.example.videocallingstreamsdkmvi.video.VideoCallViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    factory {
        val app = androidContext().applicationContext as VideoCallingApp
        app.client
    }

    viewModelOf(::ConnectViewModel)
    viewModelOf(::VideoCallViewModel)
}