
public class funcionarios {

	private double horas_trabalhadas, valordahora, percentualdedesconto, salario_bruto, totaldedesconto, resultado; 
	
	private String NomeFuncionario;
	
	public double getHorasTrabalhadas() {
		
		return this.horas_trabalhadas;
	}
	
	public double getValorDaHora() {
		
		return this.valordahora;
	}
	
	public double getPercetualDeDesconto() {
		
		return this.percentualdedesconto;
	}
	
	public String getNomeFuncionario() {
		
		return this.NomeFuncionario;
	}
	
	
    public void setPercetualDeDesconto(int percentualdedesconto) {
		
	    this.percentualdedesconto = percentualdedesconto;
	    
	}
    
    public void setValorDaHora(double valordahora) {
		
	    this.valordahora = valordahora;
	}
    
    public void setHorasTrabalhadas(double horas_trabalhadas) {
		
	    this.horas_trabalhadas = horas_trabalhadas;
	}
    
    public void setNomeFuncionario(String NomeFuncionario) {
    	
    	this.NomeFuncionario = NomeFuncionario;
    	
    }
    
    public void calcularSalario() {
    	
    	this.salario_bruto = this.horas_trabalhadas * this.valordahora;
    	System.out.println("O Seu Salario Bruto: " + salario_bruto);
    	
    	
    }
    
    public void calcularTotalDesconto() {
    	
    	double resultado = ((this.percentualdedesconto / 100) * this.salario_bruto);
    	System.out.println("Total De Desconto: " + resultado);
    	this.resultado =  resultado;
    }
    
    public void SalarioLiquido() {
    	
    	double res = (this.salario_bruto - this.resultado);
    	System.out.println("Salario Liquido " + res);
    	
    	
    }
    
	
}