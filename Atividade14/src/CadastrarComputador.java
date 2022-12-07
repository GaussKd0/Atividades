public class CadastrarComputador {

      public static void setComputador() {
    	
    	Computadores computador1 = new Computadores();
    	computador1.SetArmazenamento("1TB");
    	computador1.SetMemoria("8gb Ram");
    	computador1.SetModelo("Lenovo");
    	computador1.SetProcessador("Core Intel i9 - 9900k");
    	computador1.SetPlacaDeVideo("Nvidia Rtx2060");
    	
    
    	System.out.println("Especificações " + computador1.GetModelo() + "\n"  + computador1.GetMemoria() + "\n" + computador1.GetArmazenamento() + "\n" + computador1.GetPlacaDeVideo() + "\n" + computador1.GetProcessador());
    	removerComputador();
    	System.out.println("Especificações " + computador1.GetModelo() + "\n"  + computador1.GetMemoria() + "\n" + computador1.GetArmazenamento() + "\n" + computador1.GetPlacaDeVideo() + "\n" + computador1.GetProcessador());

    }
      
      public static void removerComputador() {
    	  
      
      }
}
