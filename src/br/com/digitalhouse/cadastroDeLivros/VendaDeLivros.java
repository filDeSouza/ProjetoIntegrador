package br.com.digitalhouse.cadastroDeLivros;

import java.util.Scanner;

public class VendaDeLivros {

    Scanner cadastroLivros = new Scanner(System.in);
    Livro novoLivro = new Livro();
    Estoque novoCadastro = new Estoque();

    public void venda (){

        do {
            System.out.println("\nDigite o codigo do livro que deseja vender: ");
            int codigo = cadastroLivros.nextInt();
            int qtdeestoque = 0;

            for (int i = 0; i < novoCadastro.getLivros().size(); i++) {

                if (codigo == novoCadastro.getLivros().get(i).getCodigo()) {

                    if (novoCadastro.getLivros().get(i).getCodigo() < 1) {
                        System.out.println("Não há mais livros em estoque com esse código");
                    } else {
                        qtdeestoque = novoCadastro.getLivros().get(i).getQtdeEstoque() - 1;
                        System.out.println("\nQuantidade em estoque: " + novoCadastro.getLivros().get(i).getQtdeEstoque());
                        novoCadastro.getLivros().get(i).setQtdeEstoque(qtdeestoque);
                        System.out.println("\nQuantidade em estoque atualizada: " + novoCadastro.getLivros().get(i).getQtdeEstoque());
                    }


                } else {
                    System.out.println("Não há livros em estoque com esse código!");
                }

            }

            System.out.println("\nDigite 's' para vender um novo livro, ou 'n' para finalizar: ");
            novoLivro.setContinuar(cadastroLivros.next());

        }while (novoLivro.getContinuar().equals("s")) ;

    }

}
