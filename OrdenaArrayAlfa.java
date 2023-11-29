import java.util.Scanner;

public class OrdenaArrayAlfa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca longitud de Array: ");
        int longitud = sc.nextInt();
        String[] arrayAlfa = new String[longitud];

        System.out.println("Introduzca valores alfabéticos de Array: ");
        for (int i = 0; i < longitud; i++) {
            arrayAlfa[i] = sc.nextLine();
        }
        

        // Ordenar Alfabéticamente

        String[] alfaOrdenado = new String[longitud];
        int control = 0;

        for (int i = 0; i < alfaOrdenado.length; i++) {
            for (int j = 0; j < arrayAlfa.length; j++) {
                control = Integer.hashCode(arrayAlfa[j].charAt(0));
            }
            System.out.println(control);
        }
    }
}
