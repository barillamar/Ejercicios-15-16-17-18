package out.com.JavaAvanzado.Ejercicios.Ejercicios15to18;

public class Ejercicio1 {
    public static void main(String[] args) {
        int valor = 10;

        try {
            int resultado = valor / 0;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero: " + e.getMessage());
        }
    }
}
