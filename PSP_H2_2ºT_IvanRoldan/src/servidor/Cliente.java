package servidor;

import java.io.*;
import java.net.*;

public class Cliente {
    private static final String SERVIDOR = "localhost";
    private static final int PUERTO = 12345;

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVIDOR, PUERTO);
             BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader consola = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Conectado al servidor en " + SERVIDOR + ":" + PUERTO);

            // Pedir palabra clave al usuario
            System.out.print("Ingrese una palabra clave para buscar libros: ");
            String palabraClave = consola.readLine();

            // Enviar palabra clave al servidor
            salida.println(palabraClave);

            // Leer y mostrar los resultados del servidor
            String respuesta;
            System.out.println("\n--- Resultados de la búsqueda ---");
            while ((respuesta = entrada.readLine()) != null) {
                System.out.println(respuesta);
            }
            System.out.println("--- Fin de los resultados ---");

        } catch (IOException e) {
            System.err.println("Error al conectar con el servidor: " + e.getMessage());
        }
    }
}
