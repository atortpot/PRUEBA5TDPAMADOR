Este es mi repositorio en Github: https://github.com/atortpot/PRUEBA5TDPAMADOR.git
Este proyecto es un Sistema de Gestión de Biblioteca Digital que permite administrar una colección de medios digitales, como libros y revistas, utilizando varios patrones de diseño para mejorar la eficiencia y la flexibilidad del sistema.

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
