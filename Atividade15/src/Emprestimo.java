public class Emprestimo {


    public static void emprestimo(){
        Pessoa pessoa1 = new Pessoa();
        Livro livro1 = new Livro();

        pessoa1.SetPessoa("Pedro");

        livro1.SetLivros("Alice no pais das maravilhas");

        System.out.println(pessoa1.GetPessoa() + " Acabou De Pegar O Livro: " + livro1.GetLivros() + "\nData De Locação: 22/09/2022\nData De Devolução: 29/09/2022");

    }
}
