package com.example.videocallingstreamsdkmvi.connection

data class ConnectState(
    val name: String = "",
    val isConnected: Boolean = false,
    val errorMessage: String? = null
)