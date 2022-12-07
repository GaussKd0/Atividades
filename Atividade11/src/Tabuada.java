import java.util.Scanner;
public class Tabuada {

	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Para Ver A Tabuada De Soma Digite: [1] Ou Digite: [2] Para Multiplicacao");	
		int resposta = scan.nextInt();
		if (resposta == 2) {
			
			System.out.println("Digite O Numero Que Deseja Multiplicar");
			double numero = scan.nextDouble();
			
			for(double i = 1; i < 11; i++) {
				
			    double res = numero * i;
			    System.out.println(numero + " X " + i + "É Igual A: " + res);
			}
		}
		else if (resposta == 1) {
			System.out.println("Digite O Numero Que Deseja Somar");
			double numero = scan.nextDouble();
			
			for(double i = 1; i < 11; i++) {
				
			    double res = numero + i;
			    System.out.println(numero + " + " + i + "É Igual A: " + res);
			}
		}
	}
}
