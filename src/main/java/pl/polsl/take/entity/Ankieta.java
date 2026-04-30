package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter @Setter @NoArgsConstructor
public class Ankieta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAnkiety;

    @Column(length = 150, nullable = false)
    private String tytul;

    private LocalDate dataRozpoczecia;
    private LocalDate dataZakonczenia;

    @ManyToOne
    @JoinColumn(name = "id_wykladowcy")
    private Wykladowca wykladowca;

    @ManyToOne
    @JoinColumn(name = "id_przedmiotu")
    private Przedmiot przedmiot;

    @JsonIgnore
    @OneToMany(mappedBy = "ankieta", cascade = CascadeType.ALL)
    @OrderBy("kolejnosc ASC")
    private List<Pytanie> pytania;
}
