package br.com.digitalhouse.cadastroDeLivros;

import java.util.InputMismatchException;

public class Livro {

    private int codigo;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private int codigoISBN;
    private int qtdeEstoque;
    private double preco;

    private String continuar;

/*    public Livro(int codigo, String titulo, String autor, int anoLancamento, int codigoISBN, int qtdeEstoque, double preco) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.codigoISBN = codigoISBN;
        this.qtdeEstoque = qtdeEstoque;
        this.preco = preco;
    }*/

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) throws InputMismatchException{

        try {
            this.codigo = codigo;
        }catch (InputMismatchException e){
            System.out.println("Erro: "+e.getMessage());
            throw new InputMismatchException ("O código do livro deve ser numérico!");
        }

    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getAnoLancamento() {

        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {

        this.anoLancamento = anoLancamento;
    }

    public int getCodigoISBN() {

        return codigoISBN;
    }

    public void setCodigoISBN(int codigoISBN) {

        this.codigoISBN = codigoISBN;
    }

    public int getQtdeEstoque() {

        return qtdeEstoque;
    }

    public void setQtdeEstoque(int qtdeEstoque) {

        this.qtdeEstoque = qtdeEstoque;
    }

    public double getPreco() {

        return preco;
    }

    public void setPreco(double preco) {

        this.preco = preco;
    }

    public String getContinuar() {
        return continuar;
    }

    public void setContinuar(String continuar) {
        this.continuar = continuar;
    }
}
