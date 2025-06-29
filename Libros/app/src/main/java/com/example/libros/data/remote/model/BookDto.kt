package com.example.libros.data.remote.model

data class BookDto(
    val title: String?,
    val author_name: List<String>?,
    val first_publish_year: Int?,
    val cover_i: Int?
) {
    fun toBookEntity(): com.example.libros.data.local.BookEntity {
        return com.example.libros.data.local.BookEntity(
            title = title ?: "Sin título",
            author = author_name?.firstOrNull() ?: "Autor desconocido",
            year = first_publish_year,
            coverUrl = cover_i?.let { "https://covers.openlibrary.org/b/id/$it-L.jpg" }
        )
    }
}
