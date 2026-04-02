package br.edu.catalogo;

public class Principal {

    public static void main(String[] args) {

        Livro[] livros = new Livro[5];

        livros[0] = new Livro("Java Básico", "João Silva", 2020);
        livros[1] = new Livro("Python Fácil", "Maria Souza", 2019);
        livros[2] = new Livro("Java Avançado", "Carlos Lima", 2021);
        livros[3] = new Livro("Banco de Dados", "Ana Costa", 2018);
        livros[4] = new Livro("Java para Iniciantes", "Pedro Rocha", 2022);

        for (int i = 0; i < livros.length; i++) {

            if (livros[i].titulo.contains("Java")) {
                livros[i].exibirInformacoes();
            }

        }

    }

}