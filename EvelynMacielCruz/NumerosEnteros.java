public class NumerosEnteros {  // Definimos una clase pública llamada NumsEnteros

    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa
        int num = 0;  // Declaramos e inicializamos una variable entera llamada num con el valor 0

        while (num % 2 == 0 && num <= 1000) {  // Bucle while que se ejecuta mientras num sea par y menor o igual a 1000
            System.out.println(num);  // Imprime el valor actual de num en la consola
            num += 2;  // Incrementa num en 2 para mantenerlo siempre par
        } // llave que cierra el while
    } // llave que cierra el método principal
} // llave que cierra la clase NumsEnteros 