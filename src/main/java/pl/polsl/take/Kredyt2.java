package pl.polsl.take;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class Kredyt2 {
	private Double kwota;
    private Double procent;
    private Integer ilerat;
    private Double rata;

    public double obliczRate() {
        double m = 1 - 1 / Math.pow(1.0 + procent / 12, ilerat);
        this.rata = kwota * (procent / 12) / m;
        return rata;
    }

}
