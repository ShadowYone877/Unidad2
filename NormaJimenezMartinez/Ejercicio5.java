//Nombre de la clase
class Ejercicio5 {

    // Método principal
    public static void main(String[] args) {

        // Ciclo para recorrer los números desde 1 hasta 9
        for (int u = 1; u <= 9; u++) {

            // Imprimir que tabla es
            System.out.println("\nTabla del " + u + "\n");

            // Ciclo para recorrer los números desde 1 hasta 10
            for (int d = 1; d <= 10; d++) {

                // Imprime la multiplicación de los números
                System.out.println(u + " * " + d + " = " + (u * d));

            }
        }
    }
}