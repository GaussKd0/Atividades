public class Blusa extends Roupa{

    private String Tipo;
    private String Marca;
    public  String getTipo(){
        return Tipo;
    }

    public  String getMarca(){
        return Marca;
    }
    public void setTipo(String Tipo){

        this.Tipo = Tipo;
    }
    public void setMarca(String Marca){

        this.Marca = Marca;
    }

    public void Caracteristicas(){
        System.out.println("Cor Da Blusa: " + super.getCor() + "\nTamanho Da Blusa: " + super.getTamanho() + "\nMaterial Da Blusa: " + super.getMaterial() + "\nTipo De Blusa: " + getTipo() + "\nMarca Da Blusa: " + getMarca());
    }

}
