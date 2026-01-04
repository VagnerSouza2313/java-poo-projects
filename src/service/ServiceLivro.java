package service;

import model.Livro;
import repository.LivroRepository;

import java.util.List;

public class ServiceLivro {

    private LivroRepository repository;

    public ServiceLivro(LivroRepository repository) {
        this.repository = repository;
    }

    public void cadastrarLivro(String titulo) {
        Livro livro = new Livro(titulo);
        repository.salvar(livro);
    }

    public String emprestarLivro(String titulo) {
        Livro livro = repository.buscarPorTitulo(titulo);

        if (livro == null) {
            return "Livro não encontrado";
        }

        if (livro.isEmprestado()) {
            return "Livro já está emprestado";
        }

        livro.emprestar();
        return "Livro emprestado com sucesso";
    }

    public String devolverLivro(String titulo) {
        Livro livro = repository.buscarPorTitulo(titulo);

        if (livro == null) {
            return "Livro não encontrado";
        }

        livro.devolver();
        return "Livro devolvido com sucesso";
    }

    public List<Livro> listarTodos(){
        return repository.listar();
    }
}









