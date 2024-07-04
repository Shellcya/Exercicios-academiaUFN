package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Livro")

public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer isbn;
    private String titulo;
    private Integer ano_publicacao;

    @ManyToOne
    @JoinColumn(name="fk_editora", nullable=false)
    private Editora editora;

    @ManyToOne
    @JoinColumn(name = "fk_categoria", nullable = false)
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "Autor", nullable = false)
    private Autor autor;


    public Livro(Integer isbn, String titulo , Editora editora, Categoria categoria, Autor autor, Integer ano_publicacao) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = editora;
        this.ano_publicacao = ano_publicacao;
        this.categoria = categoria;
        this.autor = autor;

    }


}
