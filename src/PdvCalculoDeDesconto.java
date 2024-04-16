import java.text.DecimalFormat;
import java.util.Scanner;

public class PdvCalculoDeDesconto {

    public static void main(String[] args) {

        //variaveis
        double ValorTotal, ValorFinal, TaxaDesconto, ValorDesconto, DinheiroCliente, Troco;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");
        System.out.println("Digite o valor total da compra: ");
        ValorTotal = teclado.nextDouble();
        System.out.println("Digite o Desconto: ");
        TaxaDesconto = teclado.nextDouble();
        ValorDesconto = ValorTotal * (TaxaDesconto /100);
        ValorFinal = ValorTotal - ValorDesconto;
        System.out.println("A compra ficou " + formatador.format(ValorFinal) + " R$ com os " + TaxaDesconto +  "% de desconto ");
        System.out.println("Valor recebido em dinheiro: ");
        DinheiroCliente = teclado.nextDouble();
        Troco = DinheiroCliente - ValorFinal;
        System.out.println("O troco ficou: " + formatador.format(Troco) + " R$");

        teclado.close();
    }
}
