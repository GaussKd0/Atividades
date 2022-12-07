public class Proprietario {
    private String Nome;
    private String Cpf;
    private String Rg;
    private String DataDeNascimento;
    private String Rua;
    private String Bairro;
    private String Estado;

    public String getNome(){
        return Nome;
    }

    public String getCpf(){
        return Cpf;
    }
    public String getRG(){
        return Rg;
    }
    public String getDataDeNascimento(){
        return DataDeNascimento;
    }
    public String getRua(){
        return Rua;
    }
    public String getBairro(){
        return Bairro;
    }
    public String getEstado(){
        return Estado;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        DataDeNascimento = dataDeNascimento;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public void setRua(String rua) {
        Rua = rua;
    }
}
