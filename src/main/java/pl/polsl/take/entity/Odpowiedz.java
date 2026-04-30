package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Getter @Setter @NoArgsConstructor
public class Odpowiedz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idOdpowiedzi;

    @Column(columnDefinition = "TEXT")
    private String wartoscTekstowa;

    @ManyToOne
    @JoinColumn(name = "id_pytania", nullable = false)
    private Pytanie pytanie;
    
    @ManyToOne
    @JoinColumn(name = "nr_albumu", nullable = false)
    private Student student;
}
