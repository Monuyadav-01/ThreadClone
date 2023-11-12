package com.example.threadclone.navigation

sealed class Routes(val routes: String) {
    data object Home : Routes("home")
    data object Notification : Routes("notification")
    data object AddThreads : Routes("add_threads")
    data object Search : Routes("search")
    data object Splash : Routes("spalsh")
    data object Profile : Routes("profile")
    data object BottomNav : Routes("bottom_nav")
}