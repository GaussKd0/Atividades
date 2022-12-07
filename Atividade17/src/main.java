public class main{

    public  static  void main(String[] Args){
        Blusa blusa1 = new Blusa();
        Calca calca1 = new Calca();
        blusa1.setCor("Branca");
        blusa1.setTamanho("GG");
        blusa1.setMaterial("Algodão");
        blusa1.setTipo("Frio");
        blusa1.setMarca("Aleatoria");
        blusa1.Caracteristicas();
        System.out.println(calca1.getMarca());
    }
}
