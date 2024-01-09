public class QuintoDesafio {
    public static void main(String[] args) {
        //Declare uma variável do tipo double valorEmDolares. Atribua um
        // valor em dólares a essa variável. Considere que o valor de 1 dólar
        // é equivalente a 4.94 reais. Realize a conversão do valor em dólares
        // para reais e imprima o resultado formatado.

        double valorEmDolares = 100.00;
        double taxaDeCambio = 4.94;
        double valorEmReais = valorEmDolares * taxaDeCambio;

        System.out.println("Os " + valorEmDolares + " em dólares equivilam a " + valorEmReais + " em reais.");


    }
}
