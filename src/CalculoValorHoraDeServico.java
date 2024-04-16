import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoValorHoraDeServico {

    public static void main(String[] args){
        double hora, remuneracao, custo, cargaHoraria;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        System.out.println("Calculo do valor da hora de um servico");
        System.out.println("Remuneracao mensal pretendida: ");
        remuneracao = teclado.nextDouble();
        System.out.println("Custo operacional mensal:");
        custo = teclado.nextDouble();
        System.out.println("Carga horaria mensal de trabalho: ");
        cargaHoraria = teclado.nextDouble();

        hora = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2)) / cargaHoraria;

        System.out.println("Valor da hora: " + formatador.format(hora));

        teclado.close();
    }
}
