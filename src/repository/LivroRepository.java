package repository;

import model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroRepository<T> {

    private List<T> guardarLivros;

    public LivroRepository() {
        this.guardarLivros = new ArrayList<>();
    }

    public void salvarLivro(T livro){
        guardarLivros.add(livro);
    }

    public void livrosDisponiveis(){
        for (T livro : guardarLivros){
            System.out.println(livro);
        }
    }

    public List<T> getGuardarLivros() {
        return guardarLivros;
    }

    public void setGuardarLivros(List<T> guardarLivros) {
        this.guardarLivros = guardarLivros;
    }
}
