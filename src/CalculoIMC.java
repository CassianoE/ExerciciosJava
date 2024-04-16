import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        double peso, altura, imc;

        System.out.println("Calculo IMC");
        System.out.println("Digite seu peso: ");
        peso = teclado.nextDouble();
        System.out.println("Digite sua altura: ");
        altura = teclado.nextDouble();
        imc = peso / (altura * altura);

        if (imc <= 18.5){
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Peso Ideal");
        } else if (imc >= 25.0 && imc <= 29.9 ) {
            System.out.println("Levemente acima do peso");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade grau 2 (severa)");
        } else {
            System.out.println("Obesidade 3 (morbida)");
        }

        teclado.close();
    }
}
