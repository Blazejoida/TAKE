package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter @Setter @NoArgsConstructor
public class Pytanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPytania;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String tresc;

    private Integer kolejnosc;

    @ManyToOne
    @JoinColumn(name = "id_ankiety", nullable = false)
    private Ankieta ankieta;
    
    @JsonIgnore
    @OneToMany(mappedBy = "pytanie", cascade = CascadeType.ALL)
    private List<Odpowiedz> odpowiedzi;
}
