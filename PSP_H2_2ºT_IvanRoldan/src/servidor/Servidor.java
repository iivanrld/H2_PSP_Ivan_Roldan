package servidor;

import java.io.*;
import java.net.*;
import java.util.List;

public class Servidor {
    private static final int PUERTO = 12345;

    public static void main(String[] args) {
        System.out.println("Servidor escuchando en el puerto " + PUERTO);

        try (ServerSocket serverSocket = new ServerSocket(PUERTO)) {
            while (true) {
                Socket cliente = serverSocket.accept();
                System.out.println("Cliente conectado desde: " + cliente.getInetAddress());

                // Manejar la solicitud del cliente
                try (BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                     PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true)) {

                    // Leer la palabra clave enviada por el cliente
                    String palabraClave = entrada.readLine();
                    System.out.println("Palabra clave recibida: " + palabraClave);

                    // Usar la capa de datos para buscar libros
                    AccesoDatos accesoDatos = new AccesoDatos();
                    List<String> resultados = accesoDatos.buscarLibros(palabraClave);

                    // Enviar los resultados al cliente
                    if (resultados.isEmpty()) {
                        salida.println("No se encontraron libros con la palabra clave: " + palabraClave);
                    } else {
                        salida.println("Resultados para '" + palabraClave + "':");
                        for (String libro : resultados) {
                            salida.println(libro);
                        }
                    }
                } catch (IOException e) {
                    System.err.println("Error al manejar la conexión con el cliente: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error al iniciar el servidor: " + e.getMessage());
        }
    }
}
