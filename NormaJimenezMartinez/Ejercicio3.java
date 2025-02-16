// Nombre de la clase 
class Ejercicio3 {

    // Método principal
    public static void main(String[] args) {

        // Ciclo para recorrer los números desde 1 hasta 20
        for (int i = 1; i <= 20; i++) {

            // Verifica si el número es divisible entre 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {

                // Imprime el numero y "FizzBuzz"
                System.out.println(i + " FizzBuzz");
            }

            // Verifica si el número es divisible entre 3
            else if (i % 3 == 0) {

                // Imprime el numero y "Buzz"
                System.out.println(i + " Fizz");
            }

            // Verifica si el número es divisible entre 5
            else if (i % 5 == 0) {

                // Imprime el numero y "Buzz"
                System.out.println(i + " Buzz");
            }

            // Si no cumple ninguna de las condiciones anteriores
            else {

                // Se imprime el numero
                System.out.println(i);
            }
        }
    }
}