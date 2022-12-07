public class Endereco {
    private String Bairro;
    private String Rua;
    private String NumeroCasa;

    public String getBairro(){
        return this.Bairro;
    }
    public String getRua(){
        return this.Rua;
    }
    public String getNumeroCasa(){
        return this.NumeroCasa;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setNumeroCasa(String NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }
}
