package entidades;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Gerencia uma coleção de objetos 'Livro'. Ela permite adicionar livros á coleção
    // lista todos os livros, encontra um livro pelo titulo, emoresta e devolve.


    // (ArrayList) para armazenar os livros e métodos para realizar operações básicas de gerenciamento da biblioteca.


    // Tipo list, que armazenará uma listta de objetos 'Livro'
    private List<Livro> livros;

    // Construtor. Inicializa o campo 'livros' como uma nova instância, criando uma lista vazia de livros.
    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    // Método para adicionar livros.
    public void adiconarLivro(Livro livro){
        livros.add(livro); // Adiciona o livro á lista de livros
    }

    // Método para listar todos os livros.
    public List<Livro> listaTodosOsLivros(){ // retorna a lista de todos os livros na biblioteca
        return livros; // Retorna a lista de livros
    }

    // Encontrar um Livro pelo Título.
    public Livro encontrarLivro(String titulo){
        for( Livro livro : livros){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
                return livro;
            }
        }
        return null;
}

// Método para emprestar um livro
public void emprestarLivro(String titulo){
    Livro livro = encontrarLivro(titulo); // Buscar livro pelo título
    if (livro != null && !livro.isEmprestado()){ // Vwrifica se o livro foi encontrado e se não está emprestado.
        livro.emprestar(); // Marca o livro como emprestado
        System.out.println();
        System.out.println("Você emprestou " + livro.getTitulo());
    }
    else{ // Caso o livro não seja encontrado...
        System.out.println("Livro não disponível ou já emprestado.");
    }
    }

    // Método para devolver um livro
    public void devolverLivro(String titulo){
        Livro livro = encontrarLivro(titulo); // Busca pelo título
        if (livro != null && livro.isEmprestado()){ // Verifica se o livro foi encontrado e se está emprestado.
            livro.devolver(); // Marca o livro como disponível.
            System.out.println();
            System.out.println("Você devolveu " + livro.getTitulo()); // Exibe uma mensagem indicando que o livro foi devolvido.
        }
        else { // Caso o livro não seja encontrado ou não esteja emprestado..
            System.out.println("Livro não encontrado ou não está emprestado.");
        }
    }
}
