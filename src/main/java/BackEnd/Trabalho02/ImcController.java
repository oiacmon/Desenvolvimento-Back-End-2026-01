package BackEnd.Trabalho02;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segundaquestao")
public class ImcController {
    public boolean isFloat(String valor) {
        try {
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    @PostMapping("/imc")
    public String imc(@RequestBody ImcRequest dados) {
        Float peso = dados.peso;
        Float altura = dados.altura;

        Float calcimc = peso / (altura * altura);

        return String.format("Seu IMC é igual a %.2f", calcimc);
    }
}
//fazer readme para isso, tirar comentarios do 1