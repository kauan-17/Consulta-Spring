package consulta.com.example.demo.controller;

import consulta.com.example.demo.model.Consulta;
import consulta.com.example.demo.service.ConsultaService;
import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
@Tag(name = "Consulta", description = "Operações relacionadas às consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService service;

    @GetMapping
    public List<Consulta> listarTodas() {
        return service.listarTodas();
    }

    @PostMapping
    public Consulta cadastrar(@RequestBody Consulta consulta) {
        return service.salvar(consulta);
    }

    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id, @RequestBody Consulta consulta) {
        return service.atualizar(id, consulta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
