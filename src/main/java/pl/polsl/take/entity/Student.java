package pl.polsl.take.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Getter @Setter @NoArgsConstructor
public class Student {

    @Id
    @Column(length = 20)
    private String nrAlbumu;

    @Column(length = 50, nullable = false)
    private String imie;

    @Column(length = 50, nullable = false)
    private String nazwisko;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<Odpowiedz> odpowiedzi;
}
