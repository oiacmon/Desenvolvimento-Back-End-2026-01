package BackEnd.Trabalho02.SetimaQuestao;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setimaquestao")
public class FuncionarioController {

    @GetMapping("/funcionarios")
    public List<Funcionario> getAll() {
        return FuncionarioList.funcionarios;
    }

    @GetMapping("/funcionarios/{id}")
    public Funcionario getOne(@PathVariable int id) {
        return FuncionarioList.funcionarios.stream()
                .filter(f -> f.id == id)
                .findFirst()
                .orElse(null);
    }
    @DeleteMapping("/funcionarios/{id}")
    public String delete(@PathVariable int id) {

        boolean removed = FuncionarioList.funcionarios.removeIf(f -> f.id == id);

        if (removed) {
            return "Funcionário removido com sucesso!";
        } else {
            return "Funcionário não encontrado.";
        }
    }

    @PostMapping("/funcionarios")
    public String save(@RequestBody Funcionario f) {
        FuncionarioList.funcionarios.add(f);
        return "Funcionário cadastrado com sucesso!";
    }

    @GetMapping("/total-pago")
    public String totalPago() {

        double total = 0;

        for (Funcionario f : FuncionarioList.funcionarios) {
            total += calcularSalario(f);
        }

        return String.format("Total pago pela empresa: R$ %.2f", total);
    }

    private double calcularSalario(Funcionario f) {

        double salario = f.salarioBruto;

        salario -= salario * 0.13; // INSS

        if (f.valeTransporte) {
            salario -= salario * 0.06;
        }

        if (f.trabalhaNoite) {
            salario += salario * 0.05;
        }

        int filhosConsiderados = Math.min(f.quantidadeFilhos, 3);
        salario += filhosConsiderados * 50;

        return salario;
    }
}

