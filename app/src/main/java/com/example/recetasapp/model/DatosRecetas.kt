package com.example.recetasapp.model

object DatosRecetas {

    fun obtenerRecetas(): List<Receta> {
        return listOf(
            Receta(
                id = 1,
                titulo = "Panqueques",
                imagenUrl = "https://s-api.qcart.app/images/comoquiero-uploads/images/recipes/originals/14.jpg?s=635x500&fit=cover&ext=webp",
                dificultad = "Fácil",
                tiempo = "20 minutos",
                descripcion = "Deliciosos panqueques caseros preparados con harina, leche y huevos. Perfectos para un desayuno dulce. falta el proceso se cocina, pero son detalles que aun no corregimos"
            ),
            Receta(
                id = 2,
                titulo = "Tarta de manzana",
                imagenUrl = "https://cdn0.recetasgratis.net/es/posts/5/4/2/torta_invertida_de_manzana_con_aceite_77245_600.webp",
                dificultad = "Media",
                tiempo = "45 minutos",
                descripcion = "Tarta tradicional de manzana con masa quebrada, manzanas frescas y un toque de canela."
            ),
            Receta(
                id = 3,
                titulo = "Ceviche chileno",
                imagenUrl = "https://www.chileanfoodandgarden.com/wp-content/uploads/2019/02/ceviche-chileno-9-1024x683-800x600.jpg",
                dificultad = "Media",
                tiempo = "30 minutos",
                descripcion = "Ceviche fresco preparado con pescado blanco, cebolla morada, cilantro y jugo de limón."
            )
        )
    }
}
