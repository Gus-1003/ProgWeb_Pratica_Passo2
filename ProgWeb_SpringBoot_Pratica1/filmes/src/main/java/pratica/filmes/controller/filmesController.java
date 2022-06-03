package pratica.filmes.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pratica.filmes.domain.Filmes;
import pratica.filmes.service.filmesService;

public class filmesController {
    
    private filmesService service;

    public filmesController(filmesService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String getHome(){
        return "index";
    }

    @GetMapping("/cadastra")
    public String doCadastra(Model model){
        Filmes longa = new Filmes();
        model.addAttribute("ato", longa);
        return "cadastra";
    }

    @PostMapping("/salvar")
    public String doSalvar(@ModelAttribute Filmes filmes){
        service.insert(filmes);
        return "redirect:/";
    }
}
