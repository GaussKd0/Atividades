public class Computadores {
	
	private String Modelo;
	private String Memoria;
	private String Armazenamento;
	private String Processador;
	private String PlacaDeVideo;
	
	
	public String GetModelo() {
		return "Modelo: " + this.Modelo;
	}
	
	public String GetMemoria() {
		return "Memoria: " +this.Memoria;
	}
	
	public String GetArmazenamento() {
		return "Armazenamento: " +this.Armazenamento;
	}
	
	public String GetProcessador() {
		return "Processador: " + this.Processador;
	}
	
	public String GetPlacaDeVideo() {
		return "Placa De Video:" + this.PlacaDeVideo;
	}
	

	public void SetModelo(String Modelo) {
		
		this.Modelo = Modelo;
	}
	
    public void SetMemoria(String Memoria) {
		
		this.Memoria = Memoria;
	}
    
    public void SetArmazenamento(String Armazenamento) {
    	
    	this.Armazenamento = Armazenamento;
    }
    
    public void SetProcessador(String Processador) {
    	
    	this.Processador = Processador;
    }
    
    public void SetPlacaDeVideo(String PlacaDeVideo) {
    	this.PlacaDeVideo = PlacaDeVideo;
    }
}
