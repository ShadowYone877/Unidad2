//Declaramos la clase

public class Enteros {

    //Declaramos el método main 
    public static void main(String[] args) {
        // Definimos un array con dos elementos:
        // - En la posición 0 (pares), almacenamos el formato para imprimir el número ("%d\n").
        // - En la posición 1 (impares), almacenamos una cadena vacía "" para que no imprima nada.
        String[] imprimir = {"%d\n", ""};  // Definimos el array

        // Recorremos los números del 1 al 100, avanzando de 1 en 1.
        for (int i = 1; i <= 100; i++) {
            // Usamos printf con el formato determinado por el array.
            // - Cuando i es par (i % 2 == 0), accederá a imprimir[0] ("%d\n") y se imprimirá i.
            // - Cuando i es impar (i % 2 == 1), accederá a imprimir[1] (""), por lo que no imprimirá nada.
            System.out.printf(imprimir[i % 2], i);  // Imprime el número actual
        } // llave que cierra el bucle for
    } // llave que cierra el método main
}   // llave que cierra la clase Enteros