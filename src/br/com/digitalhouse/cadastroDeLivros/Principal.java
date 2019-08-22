package br.com.digitalhouse.cadastroDeLivros;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String continuar = null;
        int opcao = 0;
        Scanner cadastroLivros = new Scanner(System.in);
        Livro novoLivro = new Livro();
        Estoque novoCadastro = new Estoque();

        System.out.println("\nDigite o codigo do livro: ");
        novoLivro.setCodigo(cadastroLivros.nextInt());

        System.out.println("\nDigite o título do livro: ");
        novoLivro.setTitulo(cadastroLivros.next());

        System.out.println("\nDigite o autor do livro: ");
        novoLivro.setAutor(cadastroLivros.next());

        System.out.println("\nDigite o ano de lançamento do livro: ");
        novoLivro.setAnoLancamento(cadastroLivros.nextInt());

        System.out.println("\nDigite o código ISBN do livro: ");
        novoLivro.setCodigoISBN(cadastroLivros.nextInt());

        System.out.println("\nDigite a quantidade em estoque do livro: ");
        novoLivro.setQtdeEstoque(cadastroLivros.nextInt());

        System.out.println("\nDigite o preço do livro: ");
        novoLivro.setPreco(cadastroLivros.nextDouble());

        novoCadastro.cadastroDeLivros(novoLivro);

        do {

            System.out.println("\nDigite 1 para cadastrar um novo livro, 2 para consultar ou 3 para efetuar uma venda: ");
            opcao = cadastroLivros.nextInt();

            if (opcao != 1 && opcao != 2 && opcao != 3){
                System.out.println("Opção inválida!");
            }

            //System.out.println("variavel: "+opcao);


            if (opcao == 1) {

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
                    continuar = cadastroLivros.next();

                } while (continuar.equals("s"));

            } else if (opcao == 2) {

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
                    continuar = cadastroLivros.next();

                } while (continuar.equals("s"));

            } else if (opcao == 3) {

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
                    continuar = cadastroLivros.next();
                }while (continuar.equals("s")) ;

            }

        }while (opcao == 1 || opcao == 2 || opcao == 3);
    }

}
