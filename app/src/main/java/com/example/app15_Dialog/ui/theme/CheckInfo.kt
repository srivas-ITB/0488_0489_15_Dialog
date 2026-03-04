package com.example.app15_Dialog.ui.theme

data class CheckInfo(
    val title: String,
    var checked: Boolean = false,
    var onCheckedChange: (Boolean) -> Unit
)
