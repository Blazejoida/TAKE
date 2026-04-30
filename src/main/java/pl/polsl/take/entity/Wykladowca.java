package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter @Setter @NoArgsConstructor
public class Wykladowca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idWykladowcy;

    @Column(length = 50, nullable = false)
    private String imie;

    @Column(length = 50, nullable = false)
    private String nazwisko;

    @Column(length = 30)
    private String tytul;

    @JsonIgnore
    @OneToMany(mappedBy = "wykladowca")
    private List<Ankieta> ankiety;
}