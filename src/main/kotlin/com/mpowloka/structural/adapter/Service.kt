package com.mpowloka.structural.adapter

class Service {

    private val users = listOf(
            User("Todd", "Williams"),
            User("Todd", "Mon"),
            User("Bruce", "Jones"),
            User("Beatrice", "Smith"),
            User("Matt", "Love")

    )

    fun getUsersByFirstLetter(firstLetter: Char): List<User> {
        return users.filter { it.firstName[0] == firstLetter }
    }

}
