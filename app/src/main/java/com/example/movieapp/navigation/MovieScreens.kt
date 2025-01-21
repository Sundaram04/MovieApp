package com.example.movieapp.navigation

enum class MovieScreens{
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRute(route: String): MovieScreens
        = when(route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognized")
        }
    }
}