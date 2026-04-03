package BackEnd.Trabalho02.QuintaQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/quintaquestao")
public class TriangleController {

    @PostMapping("/triangle")
    public String triangleType(@RequestBody TriangleRequest dados) {

        int a = dados.lado1;
        int b = dados.lado2;
        int c = dados.lado3;

        return tipoTriangulo(a, b, c);
    }

    private String tipoTriangulo(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "Não é um triângulo";
        }

        Set<Integer> lados = new HashSet<>(List.of(a, b, c));
        System.out.println("Tamanho do Set: " + lados.size());

        return switch (lados.size()) {
            case 1 -> "Equilátero";
            case 2 -> "Isósceles";
            case 3 -> "Escaleno";
            default -> "Erro inesperado";
        };
    }
}