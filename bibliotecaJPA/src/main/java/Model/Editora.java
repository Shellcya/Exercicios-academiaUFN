package Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name ="editora")
@AllArgsConstructor
@NoArgsConstructor
public class Editora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    public Editora(String nome ){
                this.nome = nome;
    }
}
