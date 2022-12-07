public class Main {
    public static void main(String[] args) {
       //METODOS ACELERAR FREIAR E MARCHA RE ESTÃO INCLUIDOS NA CLASSE CARRO
       Carro carro1 = new Carro();
       carro1.setProprietario("Pedro");
       carro1.setVelocidadeMaxima(220);
       carro1.setAno(2021);
       carro1.setModelo("Honda Civic");
       carro1.setCor("Branco");
       carro1.setTetoSolar("Possui");
       carro1.setNumeroPortas(4);
       carro1.setTipoDoCambio("Automatico");
       carro1.setChassi("13HFA16307Z118010");
       carro1.setVolumeDeCombustivel(56);
       carro1.PrintarInformacoes();

    }
}