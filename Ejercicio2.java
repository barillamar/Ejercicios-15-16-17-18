package out.com.JavaAvanzado.Ejercicios.Ejercicios15to18;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};

        try {
            for (int numero : numeros){
                int resultado = numeros[9];
                System.out.println(resultado);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El número no se encuentra en el array: " + e.getMessage());
        }
    }
}
