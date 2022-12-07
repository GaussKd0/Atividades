import java.util.Scanner;
public class segundograu {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 
	     System.out.println("Valor De A: ");
	     double A = scan.nextDouble();
	     
	     System.out.println("Valor De B: ");
	     double B = scan.nextDouble();
	     
	     System.out.println("Valor De C: ");
	     double C = scan.nextDouble();
	     
	     double D = Math.pow(B, 2) - (4 * A * C);
	     
	     double X1 = (-B + Math.sqrt(D)) / (2 * A);
	     double X2 = (-B - Math.sqrt(D)) / (2 * A);
	     
	     System.out.println("Valor De A: " + A + " Valor De B: "  + B + " Valor De C: " + C + "\nDelta: " + D);
	     
	     System.out.println("X1: " + X1);
	     
	     System.out.println("X2: " + X2);
	}	
}
