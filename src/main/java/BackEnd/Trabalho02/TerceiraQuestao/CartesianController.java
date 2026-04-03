package BackEnd.Trabalho02.TerceiraQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/terceiraquestao")
public class CartesianController {

    @PostMapping("/cartesian")
    public String cartesian(@RequestBody CartesianRequest dados) {
        int x1 = dados.x1;
        int y1 = dados.y1;
        int x2 = dados.x2;
        int y2 = dados.y2;

        double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        distance = Math.sqrt(distance);

        return String.format("%1$,.2f", distance);
    }
}

