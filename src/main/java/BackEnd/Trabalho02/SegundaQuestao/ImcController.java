package BackEnd.Trabalho02.SegundaQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundaquestao")
public class ImcController {

    @PostMapping("/imc")
    public String imc(@RequestBody ImcRequest dados) {

        float peso = dados.peso;
        float altura = dados.altura;

        float calcImc = peso / (altura * altura);

        return String.format("Seu IMC é igual a %.2f", calcImc);
    }
}