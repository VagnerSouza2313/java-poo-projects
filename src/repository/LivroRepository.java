package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();

    public void salvar(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listar() {
        return livros;
    }

    public Livro buscarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}
