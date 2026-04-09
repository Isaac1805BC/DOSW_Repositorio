## Semana 3: 

### Patrones Creacionales
Proporcionan mecanismos de creación de objetos para incrementar la flexibilidad del código.
* **Factory Method (Comercio electrónico):** Delega la creación de objetos a las subclases mediante una interfaz común. Ideal para no acoplar el código cliente a clases concretas como Tarjeta o PayPal.
* **Abstract Factory (Empresa de Videojuegos):** Produce familias completas de objetos relacionados y compatibles entre sí sin especificar sus clases concretas.
* **Builder (Fábrica de juguetes):**  Construye objetos complejos paso a paso utilizando el mismo proceso de construcción para diferentes representaciones. Aísla el código de ensamblaje.

### Patrones Estructurales
Ensamblan objetos en estructuras más grandes manteniendo la eficiencia.
* **Adapter (Gasolinería Inteligente):**  Actúa como traductor para que dos clases con interfaces incompatibles puedan trabajar juntas.
* **Bridge (Figuras y Colores):**  Pasa de la herencia a la composición. Divide una clase grande en dos dimensiones separadas para que crezcan independientemente.
* **Composite (Bodega de productos):**  Agrupa objetos en estructuras de árbol para tratarlos de manera uniforme gracias al polimorfismo y la recursión.
* **Decorador (Simulador de batalla naval):**  Añade nuevas funcionalidades a un objeto base de forma dinámica envolviéndolo en sucesivas capas.

### Patrones de Comportamiento
Tratan con algoritmos y cómo interactúan los objetos entre sí.
* **Chain of Responsibility (Embajada de Estados Unidos):**  Pasa una solicitud a lo largo de una cadena de manejadores hasta que alguien la resuelve.
* **Command (Personajes de videojuegos):**  Convierte una solicitud o botón pulsado en un objeto independiente, permitiendo encolar, mapear dinámicamente o deshacer acciones.
* **Iterator (Viaje a Roma):**  Extrae el comportamiento de recorrido de una colección sin exponer si por dentro es una lista o un árbol.
* **Strategy (Aplicación de navegación):**  Define una familia de algoritmos ,los encapsula y los hace intercambiables en tiempo de ejecución según lo que pida el usuario.