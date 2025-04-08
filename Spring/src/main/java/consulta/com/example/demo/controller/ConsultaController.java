package consulta.com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import consulta.com.example.demo.model.Consulta;
import consulta.com.example.demo.repository.ConsultaRepository;

@RestController
@RequestMapping("/consultas")
class ConsultaController {
    private final ConsultaRepository repository;
    public ConsultaController(ConsultaRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/paciente/{id}")
    public List<Consulta> consultasPorPaciente(@PathVariable Long id) {
        return repository.findByPacienteId(id);
    }
}


