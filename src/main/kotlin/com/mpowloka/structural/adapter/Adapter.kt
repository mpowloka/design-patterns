package com.mpowloka.structural.adapter

class Adapter(
        private val service: Service
) : ExpectedInterface {

    override fun getUsersByFirstName(firstName: String): List<User> {
        return service.getUsersByFirstLetter(firstName[0]).filter { it.firstName == firstName }
    }

}