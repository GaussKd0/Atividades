import java.util.Scanner;
public class trabalho {

	public static void main(String[] Args) {
		Scanner scan = new Scanner(System.in);
		funcionarios funcionario_1 = new funcionarios();
		funcionarios funcionario_2 = new funcionarios();
		
		
		System.out.println("Digite Seu Nome");
		funcionario_1.setNomeFuncionario(scan.nextLine());
		
		
		System.out.println("Digite quantas horas deseja trabalhar\n");
		funcionario_1.setHorasTrabalhadas(scan.nextInt());
		System.out.println("Valor Da Hora\n");
		funcionario_1.setValorDaHora(scan.nextInt());
		System.out.println("Percentual De Desconto\n");
		funcionario_1.setPercetualDeDesconto(scan.nextInt());
		
		System.out.println("Salario Funcionario 1 " +  funcionario_1.getNomeFuncionario() + "\n");
		funcionario_1.calcularSalario();
		funcionario_1.calcularTotalDesconto();
		funcionario_1.SalarioLiquido();
		
		funcionario_2.setNomeFuncionario("Gustavo");
		
		System.out.println("\nSalario Funcionario 2 " +  funcionario_2.getNomeFuncionario() + "\n");
		funcionario_2.setHorasTrabalhadas(8);
		funcionario_2.setValorDaHora(100);
		funcionario_2.setPercetualDeDesconto(10);
		
		funcionario_2.calcularSalario();
		funcionario_2.calcularTotalDesconto();
		funcionario_2.SalarioLiquido();
		
		
	}
}
