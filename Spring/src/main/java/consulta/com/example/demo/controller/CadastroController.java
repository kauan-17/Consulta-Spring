package consulta.com.example.demo.controller;
import consulta.com.example.demo.repository.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/completo")
    public String cadastrarTudo() {
        cadastroService.cadastrarTudo();
        return "Cadastro completo realizado com sucesso!";
    }
}
