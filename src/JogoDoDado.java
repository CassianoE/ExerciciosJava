import java.util.Scanner;

public class JogoDoDado {

    public static void main(String[] args){

        int dado, SN;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Jogo do Dado");
        do {
            System.out.println("Lancando o DADO...............");
            dado = (int) (Math.random() * 6 + 1);
            System.out.println("Face: " + dado);
            System.out.println("1 - jogar novamente");
            System.out.println("2 - Encerrar o jogo");
            SN = teclado.nextInt();
        } while (SN == 1);

        teclado.close();
    }
}
