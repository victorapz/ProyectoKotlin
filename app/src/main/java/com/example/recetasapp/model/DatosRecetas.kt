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
            ),
            Receta(
                id = 4,
                titulo = "Empanadas de pino",
                imagenUrl = "https://cocinachilena.cl/wp-content/uploads/2008/09/empanadas-pino-carne-2-scaled-1024x652.jpg",
                dificultad = "Media",
                tiempo = "1 hora 30 minutos",
                descripcion = "Tradicional empanada chilena rellena de carne, cebolla, huevo y aceitunas, horneadas al horno.",
                ingredientes = listOf(
                    "500g de carne molida",
                    "2 cebollas grandes",
                    "4 huevos duros",
                    "100g de aceitunas",
                    "12 discos de masa para empanadas",
                    "Sal, pimienta y comino al gusto"
                ),
                preparacion = listOf(
                    "Picar la cebolla y cocinarla hasta transparentar.",
                    "Agregar la carne molida y sazonar con sal, pimienta y comino.",
                    "Dejar cocinar hasta que la carne esté dorada y sin líquido.",
                    "Rellenar cada disco de masa con la carne, un trozo de huevo y una aceituna.",
                    "Cerrar y sellar las empanadas, pincelar con huevo batido.",
                    "Hornear a 200°C durante 20-25 minutos hasta dorar."
                )
            ),
            Receta(
                id = 5,
                titulo = "Pastel de choclo",
                imagenUrl = "https://www.recetasnestle.cl/sites/default/files/styles/recipe_detail_desktop_new/public/srh_recipes/44c7532f6cc86a1a506e546eb8e493eb.webp?itok=qe-G5NTA",
                dificultad = "Media",
                tiempo = "1 hora",
                descripcion = "Pastel de choclo con capa de pino, pollo y una cubierta dulce de granos de choclo molidos.",
                ingredientes = listOf(
                    "6 choclos desgranados",
                    "300g de carne molida",
                    "1 pechuga de pollo cocida",
                    "2 huevos duros",
                    "50g de aceitunas",
                    "1 cebolla",
                    "Azúcar y albahaca"
                ),
                preparacion = listOf(
                    "Procesar los granos de choclo con un poco de leche hasta formar una pasta.",
                    "Cocer la cebolla y la carne con sal, pimienta y comino.",
                    "En un molde, colocar el pino, trozos de pollo, huevo duro y aceitunas.",
                    "Cubrir con la pasta de choclo y espolvorear azúcar y hojas de albahaca.",
                    "Hornear a 180°C durante 30-35 minutos hasta dorar."
                )
            ),
            Receta(
                id = 6,
                titulo = "Ensalada chilena",
                imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/4/4c/Ensalada_chilena.jpg",
                dificultad = "Fácil",
                tiempo = "15 minutos",
                descripcion = "Fresca ensalada típica de tomate, cebolla morada y cilantro con un aliño de aceite y limón.",
                ingredientes = listOf(
                    "4 tomates maduros",
                    "1 cebolla morada",
                    "1 manojo de cilantro",
                    "2 cucharadas de aceite de oliva",
                    "1 limón",
                    "Sal y pimienta"
                ),
                preparacion = listOf(
                    "Cortar los tomates en cubos y la cebolla en pluma fina.",
                    "Picar el cilantro y mezclar con los vegetales.",
                    "Aliñar con aceite, jugo de limón, sal y pimienta.",
                    "Refrigerar por 10 minutos antes de servir."
                )
            ),
            Receta(
                id = 7,
                titulo = "Mote con huesillos",
                imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/d/d3/Mote_con_huesillos.jpg",
                dificultad = "Fácil",
                tiempo = "12 horas (incluye remojo)",
                descripcion = "Bebida y postre seco típico de Chile, hecho con trigo mote y duraznos deshidratados.",
                ingredientes = listOf(
                    "200g de mote",
                    "8 huesillos (duraznos deshidratados)",
                    "1 taza de azúcar",
                    "1 rama de canela",
                    "1 cucharadita de clavos de olor"
                ),
                preparacion = listOf(
                    "Remojar el mote durante toda la noche y luego cocer hasta que reviente.",
                    "Remojar los huesillos por 2 horas y cocer con azúcar, canela y clavos hasta ablandar.",
                    "Servir el mote frío con el jugo de los huesillos y algunos duraznos."
                )
            )
        )
    }
}
