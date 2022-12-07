import java.util.Arrays;
import java.util.Scanner;

public class Crescente {

	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		
		int[] x = new int[5];
		
		 for (int i = 1; i < x.length; i++) {
			 
			 System.out.print("Digite "+ i + " numero: ");
			 
			 x[i] = scan.nextInt();
			
		 }
		 Arrays.sort(x);
		 
		 System.out.println("Ordem Crescente:   ");
		 
		 for(int i = 1; i < x.length; i ++) {
			 System.out.println(x[i] + "");
		 }
		
		 System.out.println(x);
	}
}
