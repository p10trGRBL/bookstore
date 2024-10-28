package com.devtiro.bookstore.domain.dto

import com.devtiro.bookstore.domain.entities.AuthorEntity
import jakarta.persistence.*

data class BookDto (

    val isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val author: AuthorDto
    )