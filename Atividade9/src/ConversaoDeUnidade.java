import java.util.Scanner;

public class ConversaoDeUnidade {
	
	public static void main(String[] Args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite 1 para conveter a temperatura para farenheit ou digite 2 para  converter para  celcius ");
		int resposta = scan.nextInt();
		if(resposta == 1) {
			
			//TC/5 = (TF – 32)/9
			System.out.println("Digite A Temperatura Que Deseja Converter De Farenheit Para Celcius ");
			double Tf = scan.nextInt();
			double Tc;
			Tc = (Tf - 32)/9;
			double res = Tc * 5;
			System.out.println(res);
			
		}
		else if (resposta == 2) {
			
			System.out.println("Digite A Temperatura Que Deseja Converter De Celcius Para Farenheit ");
			double Tc = scan.nextInt();
			double Tf;
			Tf = (Tc / 5)*9;
			double res = Tf + 32;
			System.out.println(res);
			
		}
		else {
			
			System.out.println("Voce nao digitou os numeros sujeridos");
		}
		
	}

}
