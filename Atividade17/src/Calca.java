public class Calca extends Roupa{
    private String Modelo;
    private String Genero;

    public String getGenero() {

        return this.Genero;
    }

    public String getTipoModelo(){

        return  this.Modelo;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setTipoDaCalca(String Modelo){

        this.Modelo = Modelo;
    }

    public void Caracteristicas(){
        System.out.println("\nCaracteristicas Da Calça:\nCor Da Calça: " + super.getCor() + "\nTamanho Da Calça: " + super.getTamanho() + "\nMaterial Da Calça: " + super.getMaterial() + "\nTipo Da Calça: " + getTipoModelo() + "\nMarca Da Calça " + getGenero());
    }
}
