public class Carro {
    private String Modelo;
    private String Cor;
    private int Ano;
    private int Marcha;
    private String Chassi;
    private String Proprietario;
    private int VelocidadeMaxima;
    private int VelocidadeAtual;
    private int NumeroPortas;
    private int NumeroDeMarchas;
    private String TetoSolar;
    private String TipoDoCambio;
    private int VolumeDeCombustivel;


    public String GetModelo(){
        return this.Modelo;
    }
    public String GetCor(){
        return this.Cor;
    }
    public int GetAno(){
        return this.Ano;
    }
    public int GetMarca(){
        return this.Marcha;
    }
    public String GetChassi(){
        return this.Chassi;
    }
    public String GetProprietario(){
        return this.Proprietario;
    }

    public int getNumeroDeMarchas() {
        return this.NumeroDeMarchas;
    }

    public int getNumeroPortas() {
        return this.NumeroPortas;
    }

    public int getVelocidadeAtual() {
        return this.VelocidadeAtual;
    }

    public int getVelocidadeMaxima() {
        return this.VelocidadeMaxima;
    }

    public int getAno() {
        return this.Ano;
    }

    public int getVolumeDeCombustivel() {
        return this.VolumeDeCombustivel;
    }

    public String getTipoDoCambio() {
        return this.TipoDoCambio;
    }

    public String GetTetoSolar() {
        return this.TetoSolar;
    }

    public void setAno(int ano) {
       this.Ano = ano;
    }

    public void setChassi(String chassi) {
        this.Chassi = chassi;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

   public void setMarcha(int marcha) {
        this.Marcha = marcha;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public void setNumeroDeMarchas(int numeroDeMarchas) {
       this.NumeroDeMarchas = numeroDeMarchas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.NumeroPortas = numeroPortas;
    }

    public void setProprietario(String proprietario) {
        this.Proprietario = proprietario;
    }

    public void setTetoSolar(String tetoSolar) {
        this.TetoSolar = tetoSolar;
    }

    public void setTipoDoCambio(String tipoDoCambio) {
        this.TipoDoCambio = tipoDoCambio;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        VelocidadeAtual = velocidadeAtual;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        VelocidadeMaxima = velocidadeMaxima;
    }

    public void setVolumeDeCombustivel(int volumeDeCombustivel) {
        VolumeDeCombustivel = volumeDeCombustivel;
    }

    public void Acelerar(){
        for (int i = getVelocidadeAtual(); i <= getVelocidadeMaxima(); i++){
            setVelocidadeAtual(+i);
            switch (getVelocidadeAtual()){
                case 0 ->{
                    System.out.println("Marcha: 1");
                    setMarcha(1);
                }
                case 30 -> {
                    System.out.println("Marcha: 2");
                    setMarcha(2);
                }
                case 60 ->{
                    System.out.println("Marcha: 3");
                    setMarcha(3);
                }
                case 80 ->{
                    System.out.println("Marcha: 4");
                    setMarcha(4);
                }
                case 100 -> {
                    System.out.println("Marcha: 5");
                    setMarcha(5);
                }
                case 140 -> {
                    System.out.println("Marcha: 6");
                    setMarcha(6);
                }
                case 190 -> {
                    System.out.println("Marcha: 7");
                    setMarcha(7);
                }

            }
            System.out.println("Velocidade Atual: "+getVelocidadeAtual());
        }
    }
    public void Freiar(){
        for (int i = getVelocidadeAtual(); i > 0; i--){
            setVelocidadeAtual(-i);
            switch (getVelocidadeAtual()){
                case 0 ->{
                    System.out.println("Marcha: 1");
                    setMarcha(1);
                }
                case 30 -> {
                    System.out.println("Marcha: 2");
                    setMarcha(2);
                }
                case 60 ->{
                    System.out.println("Marcha: 3");
                    setMarcha(3);
                }
                case 80 ->{
                    System.out.println("Marcha: 4");
                    setMarcha(4);
                }
                case 100 -> {
                    System.out.println("Marcha: 5");
                    setMarcha(5);
                }
                case 140 -> {
                    System.out.println("Marcha: 6");
                    setMarcha(6);
                }
                case 190 -> {
                    System.out.println("Marcha: 7");
                    setMarcha(7);
                }
            }
            System.out.println("Velocidade Atual: "+ getVelocidadeAtual());
        }
        System.out.println("O carro parou");
    }
    public void MarchaRe(){
        if(getVelocidadeAtual() >0){
            System.out.println("A marcha ré não pode ser utilizada");
        }
        else if(getVelocidadeAtual() == 0){
            for (int i = getVelocidadeAtual(); i <= 40; i++){
                setVelocidadeAtual(+i);
                System.out.println("Velocidade Atua: " + getVelocidadeAtual());
            }
            System.out.println("A marcha ré atingiu a velocidade maxima");
        }
    }
    public void PrintarInformacoes(){
        System.out.println("Nome Do Proprietario: " +GetProprietario() + "\nModelo: " + GetModelo() + "\nCor: " + GetCor() + "\nAno: " + getAno() +
                "\nChassi: " + GetChassi() + "\nQuantidades De Portas: " + getNumeroPortas()  + "\nVelocidadeMaxima: " + getVelocidadeMaxima() + "\nVolume De Combustivel: " +
                getVolumeDeCombustivel() + "\nTipo De Cambio: " + getTipoDoCambio() + "\nTopo De Teto: " + GetTetoSolar()
        );
    }
    public void CalcularAutomoniaDaViagem(int ConsumoDaGasolina, int Tempo){
        int Distancia = Tempo * getVelocidadeAtual();
        int QuantidadeLitros = Distancia/ConsumoDaGasolina;
        setVolumeDeCombustivel(getVolumeDeCombustivel() - QuantidadeLitros);
        System.out.println("Se Seu Carro Andar " + Distancia +"KM Ele Vai Gastar " + QuantidadeLitros+ " Litros De Gasolina");
        System.out.println("Quantidade De Gasolina Restante: " + getVolumeDeCombustivel());
    }
}
