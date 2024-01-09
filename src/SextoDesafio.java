public class SextoDesafio {
    public static void main(String[] args) {
        //Declare uma variável do tipo double precoOriginal. Atribua um
        // valor em reais a essa variável, representando o preço original de
        // um produto. Em seguida, declare uma variável do tipo double
        // percentualDesconto e atribua um valor percentual de desconto
        // ao produto (por exemplo, 10 para 10%). Calcule o valor do
        // desconto em reais, aplique-o ao preço original e imprima o novo
        // preço com desconto.


        double precoOriginal = 150.0;
        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double precoComDesconto = precoOriginal - valorDesconto;

        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");
        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + precoComDesconto);
        System.out.println("*******************************************************************************");
        System.out.println("*******************************************************************************");

        }

    }

