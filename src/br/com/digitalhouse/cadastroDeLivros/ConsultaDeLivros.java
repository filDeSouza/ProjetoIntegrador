package br.com.digitalhouse.cadastroDeLivros;

import java.util.Scanner;

public class ConsultaDeLivros {

    Scanner cadastroLivros = new Scanner(System.in);
    Livro novoLivro = new Livro();
    Estoque novoCadastro = new Estoque();

    public void consultar (){

        do {
            System.out.println("\nDigite o codigo do livro que deseja ver: ");
            int codigo = cadastroLivros.nextInt();

            for (int i = 0; i < novoCadastro.getLivros().size(); i++) {

                if (codigo == novoCadastro.getLivros().get(i).getCodigo()) {
                    System.out.println("\nTítulo do livro: " + novoCadastro.getLivros().get(i).getTitulo());
                    System.out.println("\nAutor do livro: " + novoCadastro.getLivros().get(i).getAutor());
                    System.out.println("\nAno de lançamento: " + novoCadastro.getLivros().get(i).getAnoLancamento());
                    System.out.println("\nCódigo ISBN: " + novoCadastro.getLivros().get(i).getCodigoISBN());
                    System.out.println("\nQuantidade em estoque: " + novoCadastro.getLivros().get(i).getQtdeEstoque());
                    System.out.println("\nPreço: " + novoCadastro.getLivros().get(i).getPreco());
                } else {
                    System.out.println("Não há livros com esse código!");
                }

            }
            System.out.println("\nDigite 's' para consultar um novo livro, ou 'n' para finalizar: ");
            novoLivro.setContinuar(cadastroLivros.next());

        } while (novoLivro.getContinuar().equals("s")) ;

    }



}
