public class Proprietario extends Endereco{
    public void Printar(){
        System.out.println("\nBairro: " + super.getBairro() + "\nRua: " + super.getRua() + "\nNumero Da Casa" + super.getNumeroCasa());
    }
}
