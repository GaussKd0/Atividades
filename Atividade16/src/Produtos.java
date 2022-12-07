public class Produtos {

    private String Produtos;
    private int QuantidadeProdutosEmStock;

    private int ValorDoProduto;

    public String getProdutos(){

        return this.Produtos;
    }

    public int getQuantidadeProdutos(){

        return this.QuantidadeProdutosEmStock;
    }

    public void SetProdutos(String NomeDoProduto){

        this.Produtos = NomeDoProduto;
    }

    public void setQuantidadeProdutosEmStock(int quantidadeProdutosEmStock){

        this.QuantidadeProdutosEmStock = quantidadeProdutosEmStock;
    }

    public void setValorDoProduto(int ValorDoProdutos){

        this.ValorDoProduto = ValorDoProdutos;
    }



}
