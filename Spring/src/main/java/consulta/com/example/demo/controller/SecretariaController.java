package consulta.com.example.demo.controller;

import consulta.com.example.demo.model.Secretaria;
import consulta.com.example.demo.repository.SecretariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/secretarias")
public class SecretariaController {

    @Autowired
    private SecretariaRepository secretariaRepository;

    @PostMapping
    public Secretaria cadastrarSecretaria(@RequestBody Secretaria secretaria) {
        return secretariaRepository.save(secretaria);
    }

    @GetMapping
    public List<Secretaria> listarSecretarias() {
        return secretariaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Secretaria buscarPorId(@PathVariable Long id) {
        return secretariaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Secretaria atualizarSecretaria(@PathVariable Long id, @RequestBody Secretaria secretariaAtualizada) {
        return secretariaRepository.findById(id).map(secretaria -> {
            secretaria.setNome(secretariaAtualizada.getNome());
            secretaria.setCpf(secretariaAtualizada.getCpf());
            return secretariaRepository.save(secretaria);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarSecretaria(@PathVariable Long id) {
        secretariaRepository.deleteById(id);
    }
}
