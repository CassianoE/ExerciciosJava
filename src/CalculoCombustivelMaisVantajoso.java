import java.util.Scanner;

public class CalculoCombustivelMaisVantajoso {

    public static void main(String[] args){

        double valorGasolina, valorAlcool;


        Scanner teclado = new Scanner(System.in);

        System.out.println("Alcool x Gasolina");
        System.out.println("Digite o valor da Gasolina: ");
        valorGasolina = teclado.nextDouble();
        System.out.println("Digite o valor do Alcool: ");
        valorAlcool = teclado.nextDouble();

        if (valorAlcool <= (0.7 * valorGasolina)){
            System.out.println("Abastecer com Alcool");
        } else {
            System.out.println("Abastecer com Gasolina");
        }

        teclado.close();
    }
}
