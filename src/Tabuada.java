import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args){

        int valor,i = 0, tabuada;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor que quer a tabuada");
        valor = teclado.nextInt();

            for (i = 0; i <= 10; i++) {
                System.out.println(valor + " x " + i + " = " + (valor * i));
            }

        teclado.close();
    }
}
