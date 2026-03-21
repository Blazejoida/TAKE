package pl.polsl.take;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path="/kredyt")
public class KredytController {
	@Autowired
    private Kredyt1 kredyt1;

    @Autowired
    private Kredyt2 kredyt2;

    @GetMapping("/kredyt1")
    public @ResponseBody Double getKredyt1(@RequestParam("kwota") Double kwota) {
        return kredyt1.obliczRate(kwota, 0.1, 12);
    }

    @PostMapping("/kredyt2")
    public @ResponseBody Kredyt2 getKredyt2(@RequestBody Kredyt2 kredyt) {
        System.out.println(kredyt.getKwota() + ", " + kredyt.getProcent() + ", " + kredyt.getIlerat());
        kredyt.obliczRate();
        return kredyt;
    }
}

