package consulta.com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consulta.com.example.demo.model.Secretaria;
import consulta.com.example.demo.repository.SecretariaRepository;

@RestController
@RequestMapping("/secretarias")
class SecretariaController {
    private final SecretariaRepository repository;
    public SecretariaController(SecretariaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Secretaria> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Secretaria criar(@RequestBody Secretaria secretaria) {
        return repository.save(secretaria);
    }
}
