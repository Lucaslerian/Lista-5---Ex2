import java.util.Scanner;

public class App {
    static void ImprimaAlgarismos(int NumInformado) {
        int a = 0, b = 0;

        while (a < (NumInformado + 1)) {

            while (a < b) {
                System.out.print((b + 1) + " ");
                b = b + 1;
            }

            System.out.println();

            b = 0;
            a = a + 1;
        }

    }
    public static void main(String[] args) {

        int numero;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite um número: ");
        numero = entrada.nextInt();
        entrada.close();

        ImprimaAlgarismos(numero);

    }
}
