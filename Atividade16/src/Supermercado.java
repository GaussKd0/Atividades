import  java.util.Scanner;
public class Supermercado {
    public static void main(String[] Args){

        String Resposta;
        int Quantidade;
        Scanner scan = new Scanner(System.in);
        Produtos produto1 = new Produtos();
        Produtos produto2 = new Produtos();
        Produtos produto3 = new Produtos();
        
        produto1.SetProdutos("Feijão");
        produto1.setQuantidadeProdutosEmStock(700);
        produto1.setValorDoProduto(8);
        
        produto2.SetProdutos("Arroz");
        produto2.setQuantidadeProdutosEmStock(1000);
        produto2.setValorDoProduto(4);

        produto3.SetProdutos("Acucar");
        produto3.setQuantidadeProdutosEmStock(2000);
        produto3.setValorDoProduto(5);

        System.out.println("Quais Produtos Você Deseja Comprar [F] Feijão [A] Arroz [AC] Acucar ");
        Resposta = scan.nextLine();

        switch (Resposta){
            case "F" -> {
                System.out.println("Quantos KG Voce Vai Querer De Feijão?");
                Quantidade = scan.nextInt();
                int res = Quantidade * 8;
                if(res > produto1.getQuantidadeProdutos()){
                    System.out.println("Voce Quer Comprar Mais Do Que Temos Disponivel");
                    
                }
                else if (res <= produto1.getQuantidadeProdutos()){
                    System.out.println("Quanto Voce Vai Pagar: " + res + "RS Voce Deseja Pagar Com Dinheiro [D] Ou Com Cartão [C] E [CH] Para Cheque");

                    Resposta = scan.nextLine();

                    switch (Resposta){
                        case "D" -> {
                            System.out.println("Voce Vai Pagar Com Dinheiro");
                        }
                        case "C" -> {
                            System.out.println("Voce Vai Pagar Com Cartão");
                        }
                        case "Ch" -> {
                            System.out.println("Voce Vai Pagar Com Cheque");
                        }
                    }
                }

            }
            case "A" ->{
                System.out.println("Quantos KG Voce Vai Querer De Arroz?");
                Quantidade = scan.nextInt();
                int res = Quantidade * 4;
                if(res > produto1.getQuantidadeProdutos()){
                    System.out.println("Voce Quer Comprar Mais Do Que Temos Disponivel");

                }
                else if (res <= produto1.getQuantidadeProdutos()){
                    System.out.println("Quanto Voce Vai Pagar: " + res + "RS Voce Deseja Pagar Com Dinheiro [D] Ou Com Cartão [C] E [CH] Para Cheque");

                    Resposta = scan.nextLine();

                    switch (Resposta){
                        case "D" -> {
                            System.out.println("Voce Vai Pagar Com Dinheiro");
                        }
                        case "C" -> {
                            System.out.println("Voce Vai Pagar Com Cartão");
                        }
                        case "Ch" -> {
                            System.out.println("Voce Vai Pagar Com Cheque");
                        }
                    }
                }
            }
            case "AC" ->{
                System.out.println("Quantos KG Voce Vai Querer De Acucar?");
                Quantidade = scan.nextInt();
                int res = Quantidade * 5;
                if(res > produto1.getQuantidadeProdutos()){
                    System.out.println("Voce Quer Comprar Mais Do Que Temos Disponivel");

                }
                else if (res <= produto1.getQuantidadeProdutos()){
                    System.out.println("Quanto Voce Vai Pagar: " + res + "RS Voce Deseja Pagar Com Dinheiro [D] Ou Com Cartão [C] E [CH] Para Cheque");

                    Resposta = scan.nextLine();

                    switch (Resposta){
                        case "D" -> {
                            System.out.println("Voce Vai Pagar Com Dinheiro");
                        }
                        case "C" -> {
                            System.out.println("Voce Vai Pagar Com Cartão");
                        }
                        case "Ch" -> {
                            System.out.println("Voce Vai Pagar Com Cheque");
                        }
                    }
                }
            }
        }

    }
}
