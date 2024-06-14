package com.example.videocallingstreamsdkmvi.video

sealed interface VideoCallingAction {
    data object OnDisconnectClick : VideoCallingAction
    data object JoinCall : VideoCallingAction
}