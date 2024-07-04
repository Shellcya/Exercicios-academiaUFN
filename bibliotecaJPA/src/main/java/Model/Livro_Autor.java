package Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "livro_autor")
public class Livro_Autor {
    @Id
    private Integer id;


    @ManyToOne
    @JoinColumn(name = "fk_livro", nullable = false)
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "fk_autor", nullable = false)
    private Autor autor;


}
