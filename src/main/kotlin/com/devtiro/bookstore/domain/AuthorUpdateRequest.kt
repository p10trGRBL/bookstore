package com.devtiro.bookstore.domain

import jakarta.persistence.Column
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

data class AuthorUpdateRequest (

    val id:Long?=null,
    val name: String?=null,
    val age: Int?=null,
    val description: String?=null,
    val image: String?=null

)