# Proyecto: Libros 📚

App hecha en Android Studio con Jetpack Compose, que permite ver y administrar una lista de libros usando una API pública.

## 🔧 Funcionalidades principales

✅ Pantalla de inicio de sesión  
✅ Visualización automática de libros desde una API externa (OpenLibrary)  
✅ Agregar libros manualmente  
✅ Editar información de libros  
✅ Eliminar libros con confirmación  
✅ Almacenamiento local usando Room  
✅ Navegación entre pantallas con Navigation Compose  
✅ Diseño responsivo con MaterialTheme

## 🗂️ Estructura del proyecto

- `data/local`: Base de datos Room (BookDao, BookEntity, BookDatabase)
- `data/remote`: Modelos para los datos de la API (BookDto), instancia de Retrofit
- `data/repository`: Lógica de negocio (BookRepository.kt)
- `ui/screens`: Pantallas principales (LoginScreen, HomeScreen, DetailScreen, FormScreen)
- `viewmodel`: BookViewModel con LiveData y StateFlow
- `Navigation.kt`: Manejo de rutas y navegación entre pantallas

## 🌐 API usada

Se consume la API de OpenLibrary:  
https://openlibrary.org/search.json?q=android

Los libros se cargan automáticamente al abrir la app.

## ▶️ Pantallas

1. **LoginScreen**: Login simple (no conectado a backend)
2. **HomeScreen**: Lista combinada de libros (locales + de la API)
3. **FormScreen**: Agregar o editar libro
4. **DetailScreen**: Ver detalles de un libro y eliminarlo con confirmación

## 🎨 Diseño

- Usamos Jetpack Compose con MaterialTheme
- Estilo moderno, responsivo y minimalista
- Botón flotante para agregar libros
- Imágenes de portada desde OpenLibrary

## 🛠️ Dependencias importantes

```kotlin
implementation("androidx.compose.material:material:1.5.0")
implementation("androidx.navigation:navigation-compose:2.7.0")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.1")
implementation("androidx.room:room-runtime:2.5.2")
implementation("androidx.room:room-ktx:2.5.2")
kapt("androidx.room:room-compiler:2.5.2")
implementation("io.coil-kt:coil-compose:2.4.0")
implementation("com.squareup.retrofit2:retrofit:2.9.0")
implementation("com.squareup.retrofit2:converter-gson:2.9.0")
