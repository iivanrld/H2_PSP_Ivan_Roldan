Proyecto Cliente-Servidor de Búsqueda de Libros
Este proyecto implementa una aplicación cliente-servidor en Java que permite a un cliente buscar libros en un archivo de texto (Libros.txt) enviando una palabra clave al servidor. El servidor procesa la solicitud y devuelve los libros que contienen la palabra clave solicitada.

Arquitectura
El sistema está basado en una arquitectura cliente-servidor y consta de tres partes principales:
Capa Cliente: La aplicación cliente envía una palabra clave al servidor y muestra los resultados que contienen esa palabra clave.
Capa Servidor: El servidor escucha las solicitudes de los clientes, procesa las solicitudes de búsqueda utilizando la capa de acceso a datos y devuelve los resultados al cliente.
Capa de Acceso a Datos: Esta capa maneja la lectura del archivo Libros.txt y filtra las líneas que contienen la palabra clave proporcionada.

Tecnologías Utilizadas
Java SE: Para la creación de aplicaciones de consola y la implementación de la arquitectura cliente-servidor.
Java Sockets: Para la comunicación entre el cliente y el servidor utilizando el protocolo TCP/IP.
Java IO: Para la lectura y escritura de datos entre el cliente, servidor y el archivo de texto.
Colecciones en Java: Para almacenar los resultados de la búsqueda de libros.
Manejo de Excepciones: Para capturar y manejar errores durante la ejecución del programa.

Cómo Ejecutar el Proyecto
1. Compilar y Ejecutar el Servidor
  Abre Eclipse o tu IDE preferido.
  Ejecuta la clase Servidor.java para iniciar el servidor. El servidor escuchará en el puerto 12345.
2. Compilar y Ejecutar el Cliente
  Abre otra instancia de Eclipse o consola.
  Ejecuta la clase Cliente.java.
  El cliente te pedirá que ingreses una palabra clave para buscar libros.
  El cliente enviará la palabra clave al servidor y mostrará los libros que contienen esa palabra clave.
3. Archivo Libros.txt
  Asegúrate de que el archivo Libros.txt esté en la raíz del proyecto. Este archivo contiene una lista de libros que el servidor utiliza para realizar la búsqueda. Un ejemplo de archivo podría ser:
Java Programming Basics
Effective Java by Joshua Bloch
Clean Code by Robert C. Martin
Introduction to Algorithms
The Odyssey by Homer
Java Concurrency in Practice

4. Configuración de JDK y Eclipse
Si encuentras problemas con la versión de JDK o el entorno de ejecución, asegúrate de tener instalada una versión de JDK compatible, como JavaSE-11 o JavaSE-17, y configura el entorno de Eclipse para usar esa versión.

Funcionamiento
  Cliente: El cliente solicita al usuario una palabra clave, la envía al servidor, y muestra los resultados recibidos.
  Servidor: El servidor recibe la palabra clave, busca libros que coincidan en el archivo Libros.txt utilizando la capa de acceso a datos y envía los resultados de vuelta al cliente.
  Capa de Acceso a Datos: Esta capa lee el archivo Libros.txt y filtra las líneas que contienen la palabra clave, devolviendo solo los libros que coinciden.

Potenciales Mejoras
  Manejo de Múltiples Clientes: El servidor actualmente maneja un cliente a la vez. Implementar multithreading permitiría manejar múltiples clientes simultáneamente.
  Optimización de Búsqueda: Usar una base de datos en lugar de un archivo de texto permitiría un acceso más rápido y escalable a los datos.
  Interfaz Gráfica: Crear una interfaz gráfica (GUI) para el cliente en lugar de una consola mejoraría la experiencia del usuario.
  Validación de Entrada: Mejorar la validación de las entradas del usuario para manejar casos de error o entradas no válidas.

Contribuciones
Si deseas contribuir al proyecto, por favor abre un pull request con tus mejoras o correcciones. Asegúrate de seguir las mejores prácticas de codificación y documentar cualquier cambio realizado.
