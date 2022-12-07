public class Roupa
{
    private String Cor;
    private String Tamanho;
    private String Material;

    public String getCor(){

        return this.Cor;
    }

    public String getTamanho(){

        return this.Tamanho;
    }

    public String getMaterial(){

        return this.Material;
    }


    public String setCor(String Cor){

        this.Cor = Cor;
        return Cor;
    }

    public void setMaterial(String Material){

        this.Material = Material;
    }

    public void setTamanho (String Tamanho){

        this.Tamanho = Tamanho;
    }

}
