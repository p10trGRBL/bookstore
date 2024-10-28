package com.devtiro.bookstore

import com.devtiro.bookstore.domain.AuthorSummary
import com.devtiro.bookstore.domain.AuthorUpdateRequest
import com.devtiro.bookstore.domain.BookSummary
import com.devtiro.bookstore.domain.dto.AuthorDto
import com.devtiro.bookstore.domain.dto.AuthorSummaryDto
import com.devtiro.bookstore.domain.dto.AuthorUpdateRequestDto
import com.devtiro.bookstore.domain.dto.BookSummaryDto
import com.devtiro.bookstore.domain.entities.AuthorEntity
import com.devtiro.bookstore.domain.entities.BookEntity

fun testAuthorDtoA(id: Long? = null) = AuthorDto(
    id = id,
    name = "John Doe",
    age = 30,
    image = "author-image.jpeg",
    description = "some description"
)

fun testAuthorEntityA(id: Long? = null) = AuthorEntity(
    id = id,
    name = "John Doe",
    age = 30,
    image = "author-image.jpeg",
    description = "some description"
)

fun testAuthorEntityB(id: Long? = null) = AuthorEntity(
    id = id,
    name="Don Joe",
    age = 65,
    description = "Some other description",
    image = "some-other-image.jpeg"
)

fun testAuthorUpdateRequestDtoA(id: Long? = null) = AuthorUpdateRequestDto(
    id = id,
    name = "John Doe",
    age = 30,
    image = "author-image.jpeg",
    description = "some description"
)

fun testAuthorUpdateRequestA(id: Long?=null) = AuthorUpdateRequest(
    id = id,
    name = "John Doe",
    age = 30,
    image = "author-image.jpeg",
    description = "some description"
)

fun testBookEntityA(isbn: String, author: AuthorEntity) = BookEntity(
    isbn = isbn,
    title = "Test book A",
    description = "A test book",
    image = "book-image.jpeg",
    authorEntity = author
)

fun testAuthorSummaryDtoA(id: Long) = AuthorSummaryDto(
    id = id,
    name="John Doe",
    image = "author-image.jpeg"
)

fun testBookSummaryDtoA(isbn: String, author: AuthorSummaryDto) = BookSummaryDto(
    isbn = isbn,
    title = "Test book A",
    description = "A test book",
    image = "book-image.jpeg",
    author = author
)

const val BOOK_A_ISBN = "978-089-230342-0777"

fun testAuthorSummaryA(id: Long) = AuthorSummary(
    id=id,
    name = "John Doe",
    image = "author-image.jpeg"
)
fun testBookSummaryA(isbn: String, author: AuthorSummary) = BookSummary(
    isbn = isbn,
    title = "Test book A",
    description = "A test book",
    image = "book-image.jpeg",
    author = author
)

fun testBookSummaryB(isbn: String, author: AuthorSummary) = BookSummary(
    isbn = isbn,
    title = "Test book B",
    description = "Another test book",
    image = "book-image-b.jpeg",
    author = author
)

