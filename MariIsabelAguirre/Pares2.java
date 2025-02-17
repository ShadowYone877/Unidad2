// nombre de la clase
public class  Pares2{
    //metodo main
    public static void main(String[] args) {
        // Recorremos del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Si el residuo de dividir por 2 es 0, es un número par
            if (i % 2 == 0) {
                // Imprimimos el número
                System.out.println(i);
            }
        }
    }
}