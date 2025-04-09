package consulta.com.example.demo.controller;
import consulta.com.example.demo.repository.CadastroService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
@Tag(name = "Cadastro", description = "Operações relacionadas ao cadastro de dados iniciais")
/**
 * Controlador para operações de cadastro de dados iniciais.
 * Este controlador expõe um endpoint para realizar o cadastro completo de dados iniciais no sistema.
 */
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/completo")
    public String cadastrarTudo() {
        cadastroService.cadastrarTudo();
        return "Cadastro completo realizado com sucesso!";
    }
}
