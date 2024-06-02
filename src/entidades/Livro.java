package entidades;

public class Livro {

    // Define um modelo de livro com três atributos: titulo, autor e estado(emprestado ou não).


    private String titulo;
    private String autor;
    private boolean emprestado;

    // Construtor
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    // Métodos Getters
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public boolean isEmprestado(){
        return emprestado;
    }

    // Métodos para Emprestar e Devolver
    public void emprestar(){
        this.emprestado = true;
    }

    public void devolver(){
        this.emprestado = false;
    }

    @Override
    public String toString(){
        return titulo + " por " + autor + (emprestado? " (Emprestado)" : "(Disponível)");
    }
}
