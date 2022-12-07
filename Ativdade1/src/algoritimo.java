import java.util.Scanner;
public class algoritimo {

	public static void main(String[] Args) {
		final int automovelconsumo = 12;
		int velocidademedia = 0;
		int tempo = 0;
		int distancia =0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto tempo vai durar sua viagem?");
		tempo = scan.nextInt();
		
		System.out.println("Qual vai ser a velocidade media da sua viagem?");
		velocidademedia = scan.nextInt();
		
		distancia = (tempo * velocidademedia);
		
		int quantidadelitros = distancia / automovelconsumo;
		
		System.out.println("Voce vai gastar aproximadamente: " + quantidadelitros +" litros de gasolina na sua viagem!" );
		
		
		
	}
}
