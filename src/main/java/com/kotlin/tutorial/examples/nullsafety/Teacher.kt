package com.kotlin.tutorial.examples.nullsafety

data class Teacher(val name: String, val specialization: String, val contact: Contact? = null) {
}

data class Address(val streetName: String? = null, val county: String? = null, val streetNumber: Int? = null)

data class Contact(val address: Address? = null, val phoneNumber: String)


data class User(val name: String, val contact: Contact? = null) {
}