// nombre de la clase
public class Numeros {
    //metodo main
    public static void main(String[] args) {
        // Recorremos del 1 al 20
        for (int i = 1; i <= 20; i++) {
            // Si es múltiplo de 3 y 5, imprimimos "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Si es múltiplo de 3, imprimimos "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Si es múltiplo de 5, imprimimos "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // En cualquier otro caso, imprimimos el número
            else {
    
                System.out.println(i);
            }
        }
    }
}