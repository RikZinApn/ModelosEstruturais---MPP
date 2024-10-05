import java.util.ArrayList;
import java.util.List;

class Livro {
    private String titulo;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());
    }

    public void mostrarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}

public class Agregacao {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis");
        Livro livro2 = new Livro("1984");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.mostrarLivros();
    }
}
