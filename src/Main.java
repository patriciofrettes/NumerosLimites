import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el número hasta donde quiere mostrar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int cont = 1;

        while (cont <= limite) {
            System.out.println(cont);
            cont = cont + 1;
        }
    }
}