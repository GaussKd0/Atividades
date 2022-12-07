public class Construtor {
    public static  void main(String[] Args){
        Proprietario proprietario1 = new Proprietario();
        proprietario1.setNome("Pedro");
        proprietario1.setCpf("132.123.223-33");
        proprietario1.setRg("35.349.980-8");
        System.out.println("Nome: " +proprietario1.getNome() + "\nCpf: " + proprietario1.getCpf() + "\nRg: " + proprietario1.getRG());

    }
}
