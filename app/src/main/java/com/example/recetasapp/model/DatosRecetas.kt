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
                descripcion = "Deliciosos panqueques caseros preparados con harina, leche y huevos. Perfectos para un desayuno dulce.",
                ingredientes = listOf(
                    "2 huevos",
                    "1 taza de harina",
                    "1 taza de leche",
                    "1 cucharada de azúcar",
                    "1 pizca de sal"
                ),
                preparacion = listOf(
                    "Mezclar los huevos con la leche.",
                    "Agregar la harina y batir hasta eliminar grumos.",
                    "Agregar azúcar y sal, mezclar bien.",
                    "Calentar un sartén y verter la mezcla.",
                    "Cocinar por ambos lados hasta dorar."
                )
            ),
            Receta(
                id = 2,
                titulo = "Tarta de manzana",
                imagenUrl = "https://cdn0.recetasgratis.net/es/posts/5/4/2/torta_invertida_de_manzana_con_aceite_77245_600.webp",
                dificultad = "Media",
                tiempo = "45 minutos",
                descripcion = "Tarta tradicional de manzana con masa quebrada, manzanas frescas y un toque de canela.",
                ingredientes = listOf(
                    "2 manzanas",
                    "1 lámina de masa quebrada",
                    "2 cucharadas de azúcar",
                    "1 cucharadita de canela",
                    "50g de mantequilla"
                ),
                preparacion = listOf(
                    "Precalentar el horno a 180°C.",
                    "Pelar y cortar las manzanas en láminas.",
                    "Colocar la masa en un molde y pinchar la base con un tenedor.",
                    "Disponer las manzanas sobre la masa.",
                    "Espolvorear el azúcar y la canela sobre las manzanas.",
                    "Repartir la mantequilla en trozos pequeños por encima.",
                    "Hornear durante 40 minutos hasta dorar."
                )
            ),
            Receta(
                id = 3,
                titulo = "Ceviche chileno",
                imagenUrl = "https://www.chileanfoodandgarden.com/wp-content/uploads/2019/02/ceviche-chileno-9-1024x683-800x600.jpg",
                dificultad = "Media",
                tiempo = "30 minutos",
                descripcion = "Ceviche fresco preparado con pescado blanco, cebolla morada, cilantro y jugo de limón.",
                ingredientes = listOf(
                    "400g de pescado blanco",
                    "1 cebolla morada",
                    "1 manojo de cilantro",
                    "3 limones",
                    "Sal y pimienta"
                ),
                preparacion = listOf(
                    "Cortar el pescado en cubos pequeños.",
                    "Picar la cebolla en pluma fina y el cilantro.",
                    "Exprimir el jugo de los limones.",
                    "Mezclar todo en un bol y añadir sal y pimienta a gusto.",
                    "Dejar reposar en el refrigerador por 20 minutos antes de servir."
                )
            )
        )
    }
}
