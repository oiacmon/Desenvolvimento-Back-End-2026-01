package BackEnd.Trabalho02.PrimeiraQuestao;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraquestao")
public class CpfController {

    @PostMapping("/cpf")
    public String validarCpf(@RequestBody String cpf) {

        // Remove tudo que não for número
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            return "CPF inválido: tamanho incorreto";
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return "CPF inválido: dígitos repetidos";
        }

        if (!validarDigitos(cpf)) {
            return "CPF inválido";
        }

        return "CPF válido";
    }

    private boolean validarDigitos(String cpf) {

        int soma = 0;
        int peso = 10;

        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }

        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito > 9) primeiroDigito = 0;

        if (primeiroDigito != (cpf.charAt(9) - '0')) {
            return false;
        }

        soma = 0;
        peso = 11;

        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * peso--;
        }

        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito > 9) segundoDigito = 0;

        return segundoDigito == (cpf.charAt(10) - '0');
    }
}