package app;

import entidades.Biblioteca;
import entidades.Livro;

import java.util.Locale;
import java.util.Scanner;

public class SistemaGerenciamentoBiblioteca {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Principal
        // 1- Livro - Representa um livro.
        // 2- Biblioteca - Contém a lógica para gerenciar os livros.
        // 3- SistemaGerenciamentoBiblioteca - Contém o método main para interação com o usuário.

        Biblioteca biblioteca = new Biblioteca();

        // Laço while principal
        while(true){ // inicia um laço infinito que mantepa o sistema em execução até que o usuario escolha sair.
            System.out.println("\nSistema de gerenciamento de Biblioteca");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar todos os Livros");
            System.out.println("3. Emprestar Livro");
            System.out.println("4. Devolver Livro");
            System.out.println("5. Sair");

            System.out.println();
            System.out.print("Escolha uma opção: ");
            int escolha = sc.nextInt();
            sc.nextLine(); // Consumir a nova linha

            // Bloco  switch para escolher a ação do usuaario
            switch (escolha){
                case 1: // Adicionar livro
                    System.out.print("Digite o título do livro: ");
                    String titulo = sc.nextLine();

                    System.out.print("Digite o autor do livro: ");
                    String autor = sc.nextLine();

                    biblioteca.adiconarLivro(new Livro(titulo, autor));
                    System.out.println();
                    System.out.println("Livro adicionado.");
                    break;
                case 2: // Lista todos os livros
                    System.out.println();
                    System.out.println("Livros na biblioteca: ");
                    for (Livro livro : biblioteca.listaTodosOsLivros()){
                        System.out.println(livro);
                    }
                    break;
                case 3: // Emprestar livro
                    System.out.print("Digite o título do livro para emprestar: ");
                    titulo = sc.nextLine();
                    biblioteca.emprestarLivro(titulo);
                    break;
                case 4: // Devolver livro
                    System.out.print("Digite o título do livro para devolver: ");
                    titulo = sc.nextLine();
                    biblioteca.devolverLivro(titulo);
                    break;
                case 5: // Sair do sistema
                    System.out.println("Saindo do sistema.");
                    sc.close();
                    System.exit(0);
                default: //Opção invalida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }


    }
    // É responsável por ineragir com o usuario através do console, oferecendo um menu de opções para gerenciar os livros na biblioteca.
    // Permitindo;
    //1. adicionar
    //2. listar livros
    //3. emprestar
    //4. devolver
    //5 sair
}
