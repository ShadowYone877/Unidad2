class Pares {  // Definimos una clase llamada FizzBuzz

    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa

        for (int i = 1; i <= 20; i++) {  // Bucle for que recorre los números del 1 al 20

            if (i % 3 == 0) {  // Si el número es divisible por 3...
                System.out.println("Fizz");  // Imprime "Fizz"
            } else if (i % 5 == 0) {  // Si el número es divisible por 5...
                System.out.println("Buzz");  // Imprime "Buzz"
            } else if (i % 3 == 0 && i % 5 == 0) {  // Esta condición es incorrecta porque nunca se ejecutará, ya que si un número es divisible por 3 y 5, las condiciones anteriores lo capturan antes
                System.out.println("FizzBuzz");  // (Esta línea nunca se ejecutará)
            } else {  // Si no es divisible ni por 3 ni por 5...
                System.out.println(i);  // Imprime el número tal cual
            }   // llave que cierra la condición
        } // llave que cierra el for que recorre los números del 1 al 20
    } // llave que cierra el método principal 
} // llave que cierra la clase FizzBuzz