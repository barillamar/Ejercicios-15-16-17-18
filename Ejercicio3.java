package out.com.JavaAvanzado.Ejercicios.Ejercicios15to18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        File archivo = new File("datos.txt");
        try {
            Scanner scanner = new Scanner(archivo);
            System.out.println(scanner);

        } catch (FileNotFoundException e) {
            System.out.println("No se puede encontrar el archivo: " + e.getMessage());
        }
    }
}
