package servidor;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos {
    private static final String FILE_NAME = "./Libros.txt"; // Ruta relativa al proyecto

    // Método para buscar libros que contengan una palabra clave
    public List<String> buscarLibros(String palabraClave) {
        List<String> resultados = new ArrayList<>();
        File file = new File(FILE_NAME);

        System.out.println("Intentando abrir archivo: " + file.getAbsolutePath());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println("Leyendo línea: " + linea); // Depuración
                if (linea.toLowerCase().contains(palabraClave.toLowerCase())) {
                    resultados.add(linea);
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: No se encontró el archivo " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Resultados encontrados: " + resultados); // Depuración final
        return resultados;
    }
}
