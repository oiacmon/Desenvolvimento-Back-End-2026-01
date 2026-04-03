package BackEnd.Trabalho02.SextaQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sextaquestao")
public class CarController {

    @PostMapping("/car")
    public String calcularPreco(@RequestBody CarRequest dados) {

        double preco = dados.precoBase;

        if (dados.ar) preco += 3000;
        if (dados.cambioAutomatico) preco += 5000;
        if (dados.alarme) preco += 800;
        if (dados.pinturaEspecial) preco += 2500;
        if (dados.tetoSolar) preco += 4000;
        if (dados.kitMultimidia) preco += 1800;

        double ipi = dados.motor == 1.0 ? 0.10 : 0.20;
        preco += preco * ipi;

        if (dados.importado) {
            preco += preco * 0.30;
        }

        return String.format("Preço final do veículo: R$ %.2f", preco);
    }
}