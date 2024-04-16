import java.util.Scanner;


public class JogoPedraPapelTesoura {

    public static void main(String[] args){

        int pedra = 1, papel = 2, tesoura = 3, maquina, jogador;

        Scanner teclado = new Scanner(System.in);

        System.out.println("---------JoKenPo---------");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.println("Digite a opcao desejada:");


        //Logica do jogo

        jogador = teclado.nextInt();
        System.out.println("");
        switch (jogador) {
            case 1:
                System.out.println("Jogador Escolheu Pedra");
                break;
            case 2:
                System.out.println("Jogador Escolheu Papel");
                break;
            case 3:
                System.out.println("Jogador Escolheu Tesoura");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }

        //logica do computador

        maquina = (int)(Math.random()*3 + 1);

        switch (maquina){
            case 1:
                System.out.println("Maquina Escolheu Pedra");
                break;
            case 2:
                System.out.println("Maquina Escolheu Papel");
                break;
            case 3:
                System.out.println("Maquina Escolheu Tesoura");
                break;
        }

        //logica para determinar o vencedor

        System.out.println("");
        if (jogador == maquina){
            System.out.println("Empate");
        } else {
            if ((jogador == 1 && maquina == 3) || (jogador == 2 && maquina == 1) || (jogador == 3 && maquina == 2)) {
                System.out.println("Jogador Venceu");
            } else {
                System.out.println("Maquina Venceu");
            }
        }




        teclado.close();
    }
}
