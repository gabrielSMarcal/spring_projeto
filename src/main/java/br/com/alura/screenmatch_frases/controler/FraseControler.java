package br.com.alura.screenmatch_frases.controler;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import br.com.alura.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseControler {

    @Autowired
    private FraseService servico;

    @GetMapping ("/series/frases")
    public FraseDTO obterFraseAleatoria() {
        FraseDTO fraseDTO = servico.obterFraseAleatoria();
        return fraseDTO;
    }
}
