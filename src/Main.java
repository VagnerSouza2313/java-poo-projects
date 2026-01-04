import repository.LivroRepository;
import service.ServiceLivro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LivroRepository repository = new LivroRepository();
        ServiceLivro service = new ServiceLivro(repository);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 - Cadastrar livro");
            System.out.println("2 - Emprestar livro");
            System.out.println("3 - Devolver livro");
            System.out.println("4 - Listar livros");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título: ");
                    String titulo = scanner.nextLine();
                    service.cadastrarLivro(titulo);
                    System.out.println("Livro cadastrado");
                    break;
                case 2:
                    System.out.print("Digite o título: ");
                    String tituloE = scanner.nextLine();
                    System.out.println(service.emprestarLivro(tituloE));
                    break;
                case 3:
                    System.out.print("Digite o título: ");
                    String tituloD = scanner.nextLine();
                    System.out.println(service.devolverLivro(tituloD));
                    break;
                case 4:
                    System.out.println("Lista de livros: ");
                    System.out.println(service.listarTodos());


            }
        }
    }
}
