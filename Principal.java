import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        String codigo1 = scanner.nextLine();
        Produto produto1 = new Produto(codigo1);

        System.out.print("Digite o nome do produto: ");
        String nome1 = scanner.nextLine();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o tipo do produto: ");
        String tipo1 = scanner.nextLine();
        System.out.print("Digite o valor do produto: ");
        double valor1 = scanner.nextDouble();
        scanner.nextLine();
        produto1.inserir(nome1, quantidade1, tipo1, valor1);

        System.out.print("\nDigite o código do segundo produto: ");
        String codigo2 = scanner.nextLine();
        System.out.print("Digite o nome do segundo produto: ");
        String nome2 = scanner.nextLine();
        Produto produto2 = new Produto(codigo2, nome2);

        System.out.print("\nDigite o código do terceiro produto: ");
        String codigo3 = scanner.nextLine();
        System.out.print("Digite o nome do terceiro produto: ");
        String nome3 = scanner.nextLine();
        System.out.print("Digite a quantidade do terceiro produto: ");
        int quantidade3 = scanner.nextInt();
        Produto produto3 = new Produto(codigo3, nome3, quantidade3);

        System.out.print("\nDigite o código do quarto produto: ");
        String codigo4 = scanner.nextLine();
        System.out.print("Digite o nome do quarto produto: ");
        String nome4 = scanner.nextLine();
        System.out.print("Digite a quantidade do quarto produto: ");
        int quantidade4 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o tipo do quarto produto: ");
        String tipo4 = scanner.nextLine();
        System.out.print("Digite o valor do quarto produto: ");
        double valor4 = scanner.nextDouble();
        Produto produto4 = new Produto(codigo4, nome4, quantidade4, tipo4, valor4);

        System.out.print("\nDigite a quantidade a ser vendida do produto 1: ");
        int quantidadeVendida = scanner.nextInt();
        System.out.println(produto1.vender(quantidadeVendida));

        System.out.print("\nDigite a quantidade a ser comprada do produto 2: ");
        int quantidadeComprada = scanner.nextInt();
        System.out.print("Digite o novo valor do produto 2: ");
        double novoValor = scanner.nextDouble();
        produto2.comprar(quantidadeComprada, novoValor);
        System.out.println("Produto 2 após compra: " + produto2);

        System.out.print("\nDigite a quantidade a ser comprada do produto 3: ");
        int quantidadeComprada3 = scanner.nextInt();
        produto3.comprar(quantidadeComprada3);
        System.out.println("Produto 3 após compra: " + produto3);

        System.out.println("\nProduto 1: " + produto1);
        System.out.println("Produto 2: " + produto2);
        System.out.println("Produto 3: " + produto3);
        System.out.println("Produto 4: " + produto4);

        if (produto1.igual(produto2)) {
            System.out.println("\nProduto 1 e Produto 2 são iguais!");
        } else {
            System.out.println("\nProduto 1 e Produto 2 são diferentes!");
        }

        scanner.close();
    }
}
