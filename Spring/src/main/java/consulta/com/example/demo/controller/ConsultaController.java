package consulta.com.example.demo.controller;

import consulta.com.example.demo.model.Consulta;
import consulta.com.example.demo.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @PostMapping
    public Consulta cadastrarConsulta(@RequestBody Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @GetMapping
    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable Long id) {
        return consultaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Consulta atualizarConsulta(@PathVariable Long id, @RequestBody Consulta novaConsulta) {
        return consultaRepository.findById(id).map(consulta -> {
            consulta.setData(novaConsulta.getData());
            consulta.setNomeDentista(novaConsulta.getNomeDentista());
            consulta.setPaciente(novaConsulta.getPaciente());
            consulta.setSecretaria(novaConsulta.getSecretaria());
            return consultaRepository.save(consulta);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarConsulta(@PathVariable Long id) {
        consultaRepository.deleteById(id);
    }
}
