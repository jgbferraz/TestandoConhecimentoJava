import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        //Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double primeiraNota = 0;
        double segundaNota = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
        System.out.println("Olá irei ajuda-lo(a) a calcular a média das duas notas");
        System.out.println("Digite a primeira nota:");
        primeiraNota = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        segundaNota = scanner.nextDouble();
        media = (primeiraNota + segundaNota) / 2;
        System.out.println("A média é = " + media);
        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
    }
}