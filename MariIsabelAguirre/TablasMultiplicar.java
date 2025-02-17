// nombre de la clase
public class TablasMultiplicar {
    //metodo main
    public static void main(String[] args) {
        // Bucle externo: recorre los números del 1 al 9
        for (int i = 1; i <= 9; i++) {
            // Imprimimos la tabla
            System.out.println("Tabla del " + i + ":");

            // Bucle interno: recorre los multiplicadores del 1 al 10
            for (int j = 1; j <= 10; j++) {
                // Imprimimos la tabla
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Salto de línea para separar cada tabla
        }
    }
}