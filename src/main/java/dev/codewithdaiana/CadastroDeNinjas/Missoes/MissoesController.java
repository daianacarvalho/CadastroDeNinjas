package dev.codewithdaiana.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Mandar uma requisão para mostrar as missões
    @GetMapping("/listar")
    public String listarMissao() {
        return "Missões listadas com sucesso";
    }

    // Post -- Mandar uma requisão para criar as missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "Missão criada com sucesso";
    }

    // PUT -- Mandar uma requisão para alterar as missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "Missão alterada com sucesso";
    }

    // Delete -- Mandar uma requisão para deletar as missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "Missão deletada com sucesso";
    }
}
