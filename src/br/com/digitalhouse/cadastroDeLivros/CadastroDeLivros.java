package br.com.digitalhouse.cadastroDeLivros;

import java.util.Scanner;

public class CadastroDeLivros {

    Scanner cadastroLivros = new Scanner(System.in);
    Livro novoLivro = new Livro();
    Estoque novoCadastro = new Estoque();

    public void cadastro (){

        do {
            Livro novoLivro2 = new Livro();
            System.out.println("\nDigite o codigo do livro: ");
            novoLivro2.setCodigo(cadastroLivros.nextInt());

            System.out.println("\nDigite o título do livro: ");
            novoLivro2.setTitulo(cadastroLivros.next());

            System.out.println("\nDigite o autor do livro: ");
            novoLivro2.setAutor(cadastroLivros.next());

            System.out.println("\nDigite o ano de lançamento do livro: ");
            novoLivro2.setAnoLancamento(cadastroLivros.nextInt());

            System.out.println("\nDigite o código ISBN do livro: ");
            novoLivro2.setCodigoISBN(cadastroLivros.nextInt());

            System.out.println("\nDigite a quantidade em estoque do livro: ");
            novoLivro2.setQtdeEstoque(cadastroLivros.nextInt());

            System.out.println("\nDigite o preço do livro: ");
            novoLivro2.setPreco(cadastroLivros.nextDouble());

            novoCadastro.cadastroDeLivros(novoLivro2);

            System.out.println("\nDigite 's' para cadastrar um novo livro, ou 'n' para finalizar: ");
            novoLivro.setContinuar(cadastroLivros.next());

        } while (novoLivro.getContinuar().equals("s")) ;

    }

}
