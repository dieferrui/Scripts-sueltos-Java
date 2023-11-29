import java.util.Scanner;

public class OrdenaArrayAlfa {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca longitud de Array: ");
        int longitud = sc.nextInt();
        String[] arrayAlfa = new String[longitud];

        System.out.println("Introduzca palabras para introducir al Array: ");
        for (int i = 0; i < longitud; i++) {
            arrayAlfa[i] = sc.nextLine();
        }
        
        // Ordenar Alfabéticamente

        String valorMenor;
        for (int j = 0; j < longitud; j++) {

        }

        sc.close();
    }
}
