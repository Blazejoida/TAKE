package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @OneToMany(mappedBy = "przedmiot")
    private List<Ankieta> ankiety;
}
