package BackEnd.Trabalho02.QuartaQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quartaquestao")
public class PerimeterController {

    @PostMapping("/perimeter")
    public String perimeter(@RequestBody PerimeterRequest dados) {

        int lado1 = dados.lado1;
        int lado2 = dados.lado2;
        int lado3 = dados.lado3;

        int sumPerimeter = lado1 + lado2 + lado3;

        return String.format("O perímetro do triângulo é %d.", sumPerimeter);
    }
}