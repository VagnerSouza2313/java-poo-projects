package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Livro {
    private String nomeLivro;
    private String autorLivro;
    private LocalDate dataPublicacao;

    public Livro() {
    }

    public Livro(String nomeLivro, String autorLivro, LocalDate dataPublicacao) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.dataPublicacao = dataPublicacao;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro){
        this.nomeLivro = nomeLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
}
