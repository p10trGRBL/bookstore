package com.devtiro.bookstore.domain

import com.devtiro.bookstore.domain.entities.AuthorEntity
import jakarta.persistence.*

data class BookSummary (

    val isbn: String,
    val title: String,
    val description: String,
    val image: String,
    val author: AuthorSummary
    )