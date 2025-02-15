
class Tablas1A9 {  // Definimos una clase llamada Tablas1A9

    public static void main(String[] args) {  // Método principal donde comienza la ejecución del programa

        for (int i = 1; i <= 9; i++) {  // Bucle externo que recorre los números del 1 al 9 (cada número será la base de una tabla de multiplicar)
            System.out.println("Tabla del " + i);  // Imprime el encabezado de la tabla de multiplicar actual

            for (int j = 1; j <= 10; j++) {  // Bucle interno que recorre los números del 1 al 10 (cada número será el multiplicador)
                // Imprime la multiplicación en formato "i x j = resultado"
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }

            System.out.println();  // Imprime una línea en blanco para separar las tablas de multiplicar
        }
    }
}
