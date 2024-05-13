Este es mi repositorio en Github: https://github.com/atortpot/PRUEBA5TDPAMADOR.git

Biblioteca Digital

Este proyecto consiste en una biblioteca digital implementada en Java, que permite crear, mostrar y ordenar medios digitales como libros, revistas y periódicos. Proporciona un diseño modular utilizando interfaces y clases para diferentes tipos de medios, junto con una estrategia de ordenación para ordenar los medios por título.

Estructura del Proyecto

El proyecto está estructurado de la siguiente manera:

DigitalMedia.java: Define la interfaz DigitalMedia, que proporciona métodos para mostrar y obtener el título de un medio digital.
Book.java: Implementa la clase Book, que representa un libro y proporciona métodos para mostrar y obtener su título.
Magazine.java: Implementa la clase Magazine, que representa una revista y proporciona métodos para mostrar y obtener su título.
Newspaper.java: Implementa la clase Newspaper, que representa un periódico y proporciona métodos para mostrar y obtener su título.
SortingStrategy.java: Define la interfaz SortingStrategy, que proporciona un método para ordenar una lista de medios digitales.
TitleSortingStrategy.java: Implementa la estrategia de ordenación por título, ordenando una lista de medios digitales alfabéticamente por sus títulos.
DigitalLibrarySystem.java: Contiene el método main, que crea una lista de medios digitales, los muestra antes y después de aplicar la estrategia de ordenación por título.
Uso del Proyecto

Para utilizar la biblioteca digital:

Clona o descarga el proyecto en tu entorno de desarrollo Java.
Compila el código fuente utilizando tu compilador Java favorito.
Ejecuta la clase DigitalLibrarySystem.
Observa la salida que muestra los medios digitales antes y después de aplicar la ordenación por título.

El segundo proyecto es un Sistema de Gestión de Biblioteca Digital que permite administrar una colección de medios digitales, como libros y revistas, utilizando varios patrones de diseño para mejorar la eficiencia y la flexibilidad del sistema.

Funcionalidades Principales

1. Gestión de Medios
El sistema permite agregar, eliminar y mostrar medios digitales, incluyendo libros y revistas. Los medios pueden ser tanto individuales como colecciones de ellos.

2. Integración de Formatos
El programa integra diferentes formatos de archivos multimedia en la biblioteca sin modificar la interfaz de usuario. Esto se logra mediante el uso del patrón Adapter, que hace que los diferentes formatos sean compatibles con la interfaz estándar del sistema.

3. Notificaciones en Tiempo Real
Los usuarios pueden suscribirse para recibir notificaciones sobre nuevos lanzamientos o actualizaciones en la biblioteca. Cuando se produce un evento de este tipo, se envían notificaciones en tiempo real a los usuarios suscritos, utilizando el patrón Observer para mantenerlos informados.

Patrones de Diseño Implementados

El programa utiliza tres patrones de diseño principales:

Composite: Para tratar tanto grupos de objetos como objetos individuales de manera uniforme, permitiendo la gestión eficiente de colecciones de medios.
Adapter: Para integrar diferentes formatos de archivos multimedia en el sistema sin cambiar la interfaz de usuario.
Observer: Para notificar a los usuarios sobre nuevos lanzamientos o actualizaciones en sus suscripciones.

