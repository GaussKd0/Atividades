import java.util.Scanner;
public class CalcularRaio {
	
	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite O Raio:");
		double Raio = scan.nextInt();
		if(Raio < 0) {
			System.out.println("Nao pode ser menor do que zero");
		}
		else {
			double Resultado = 4*3.14*Raio*Raio*Raio/3;
			System.out.println(Resultado);
		}
	}

}
