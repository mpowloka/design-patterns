package com.mpowloka.structural.adapter

class Client(
        private val expectedInterface: ExpectedInterface
) {

    fun displayAllUsersByFirstLetter(firstName: String) {
        expectedInterface.getUsersByFirstName(firstName).forEach { println(it) }
    }

}