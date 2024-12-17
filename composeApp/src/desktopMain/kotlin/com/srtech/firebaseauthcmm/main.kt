package com.srtech.firebaseauthcmm

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "FirebaseAuthCMM",
    ) {
        App()
    }
}