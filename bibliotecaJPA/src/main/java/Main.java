import Model.Autor;
import Model.Categoria;
import Model.Editora;
import Model.Livro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Aponta para o local onde se encontram as configurações feitas no hibernate.cfg.xml
        Configuration cfg = new Configuration().configure("/hibernate.cfg.xml");
        //Cria uma factory
        SessionFactory factory = cfg.buildSessionFactory();
        //Cria uma nova session
        Session session = factory.openSession();
        //Inicia uma nova transaction
        session.beginTransaction();

        //criando e salvando

        //Autor autor = new Autor("J.K.Rowling", "Britânica");


        //Categoria categoria = new Categoria("Ficção Cientifica");


        // Editora editora = new Editora("Bloomsbury");

       // session.persist(autor);
       // session.persist(categoria);
        //  session.persist(editora);


        //Livro livro = new Livro();
        // livro.setIsbn(555555);
        // livro.setTitulo("Harry Potter");
        //  livro.setCategoria(categoria);
        //livro.setEditora(editora);
        //  livro.setAno_publicacao(2001);
        //  livro.setAutor(autor);

        // session.persist(livro);
        //  session.getTransaction().commit();
        //  session.close();


         //lista de editora

        List<Editora> editoras = session.createQuery("FROM Editora", Editora.class).list();
        System.out.println("Lista de Editoras:");
        for (Editora editora : editoras) {
            System.out.println(" - " + editora.getNome());
        }

        //lista de autor
         List<Autor> autores = session.createQuery("FROM Autor ", Autor.class).list();
       System.out.println("Lista de Autores:");
         for (Autor autor : autores) {
            System.out.println("Nome: " + autor.getNome() + " Nacionalidade: " + autor.getNacionalidade());}

       //  lista de categoria
         List<Categoria> categorias = session.createQuery("FROM Categoria ", Categoria.class).list();
          System.out.println("Lista de Categorias:");
         for (Categoria categoria :categorias) {
             System.out.println(" - " + categoria.getTipo_categoria());}

        //lista de livros
        // List<Livro> livros = session.createQuery("FROM Livro", Livro.class).list();
        // System.out.println("Lista de Livros:");
        // for (Livro livro : livros) {
        //     System.out.println(" - " + livro.getTitulo());
        // }

        // livros e todos os dados
        List<Livro> livros = session.createQuery("FROM Livro", Livro.class).list();
        System.out.println("Lista de Livros:");
        for (Livro livro : livros) {
            System.out.println("Titulo: " + livro.getTitulo());
            System.out.println("Categoria: " + livro.getCategoria().getTipo_categoria());
            System.out.println("Autor: " + livro.getAutor().getNome());
            System.out.println("Editora: " + livro.getEditora().getNome());
            System.out.println("Ano de publicação: " + livro.getAno_publicacao());

}
    }
}








