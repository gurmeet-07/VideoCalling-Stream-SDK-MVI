package com.example.videocallingstreamsdkmvi.connection


sealed interface ConnectAction {
    data class OnNameChange(val name: String) : ConnectAction
    data object OnConnectClick : ConnectAction
}
