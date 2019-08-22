package br.com.digitalhouse.cadastroDeLivros;

import java.util.ArrayList;

public class Estoque {

    ArrayList<Livro> livros = new ArrayList<>();

    public void cadastroDeLivros (Livro novoLivro){
        livros.add(novoLivro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
}
