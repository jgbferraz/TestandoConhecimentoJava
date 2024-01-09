public class QuartoDesafio {
    public static void main(String[] args) {
        //Declare uma variável do tipo double precoProduto e uma variável
        // do tipo int (quantidade). Calcule o valor total multiplicando o
        // preço do produto pela quantidade e apresente o resultado em
        // uma mensagem.

        double precoProduto = 15.50;
        int quantidade = 100;
        double valorTotal = precoProduto * quantidade ;
        String mensagem = "Valor do produto " + precoProduto + ", quantidade do produto em estoque " + quantidade + ", logo temos o valor total = " + valorTotal;

        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
        System.out.println(mensagem);
        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
    }
}
