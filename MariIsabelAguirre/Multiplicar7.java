// nombre de la clase
public class Multiplicar7 {
//metodo main
//declaracion de variables
    public static void main(String[] args) {
        int numero = 7; // Número cuya tabla queremos mostrar

        // Recorremos del 1 al 10 multiplicando por 7
        for (int i = 1; i <= 10; i++) {
            // Imprimimos la tabla
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}