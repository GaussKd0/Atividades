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
        calca1.setTamanho("PP");
        calca1.setCor("Preta");
        calca1.setMaterial("Algodão");
        calca1.setTipoDaCalca("Jeans");
        calca1.setGenero("Masculina");
        calca1.Caracteristicas();

    }
}
