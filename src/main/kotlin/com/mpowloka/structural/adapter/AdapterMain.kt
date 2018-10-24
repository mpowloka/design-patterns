package com.mpowloka.structural.adapter

fun main(args: Array<String>) {

    val client = Client(
            Adapter(
                    Service()
            )
    )

    println("Users named Todd:")
    client.displayAllUsersByFirstLetter("Todd")

    println("\nUsers named Matt:")
    client.displayAllUsersByFirstLetter("Matt")

}