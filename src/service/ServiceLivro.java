package service;

import model.Livro;
import repository.LivroRepository;

public class ServiceLivro {

    private LivroRepository livroRepository = new LivroRepository<>();

    public void registrarLivro(Livro livro){
        livroRepository.salvarLivro(livro);
    }

    public void listarLivrosDisponiveis(){

    }



}
