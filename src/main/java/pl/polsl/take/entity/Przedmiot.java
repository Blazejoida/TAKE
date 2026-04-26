package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Getter @Setter @NoArgsConstructor
public class Przedmiot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPrzedmiotu;

    @Column(length = 100, nullable = false)
    private String nazwa;

    @Column(length = 20, unique = true)
    private String kod;

    @OneToMany(mappedBy = "przedmiot")
    private List<Ankieta> ankiety;
}
