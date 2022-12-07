import java.util.Scanner;

public class Menu {

	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		int i =0;
		int resposta;
		String respostaS;
		while(i != 1) {
			System.out.println("Deseja Sair? Digite S Ou N Para Iniciar");
			respostaS = scan.nextLine();
			switch (respostaS) {
			case "s" -> {
				System.out.println("Saindo Do Sistema");
				i=1;
				break;
			}
			case "n" ->{
				
				System.out.println("1. Aprender\r\n"+ "2. Escrever\r\n" + "3. Falar\r\n" );
				resposta = scan.nextInt();
				switch (resposta) {
				case 1 -> {
					System.out.println("Aprendendo...");
					
					
				}
				case 2 ->{
					System.out.println("Escrevendo...");
					
				}
				
				case 3 -> {
					System.out.println("Falando...");
					
				}
				}
			}
			}
			
		}
	}
}
