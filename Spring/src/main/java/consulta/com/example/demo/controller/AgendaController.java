package consulta.com.example.demo.controller;

import consulta.com.example.demo.model.Agenda;
import consulta.com.example.demo.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    @Autowired
    private AgendaRepository agendaRepository;

    @PostMapping
    public Agenda cadastrarAgenda(@RequestBody Agenda agenda) {
        return agendaRepository.save(agenda);
    }

    @GetMapping
    public List<Agenda> listarAgendas() {
        return agendaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Agenda buscarPorId(@PathVariable Long id) {
        return agendaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Agenda atualizarAgenda(@PathVariable Long id, @RequestBody Agenda novaAgenda) {
        return agendaRepository.findById(id).map(agenda -> {
            agenda.setData(novaAgenda.getData());
            agenda.setConsulta(novaAgenda.getConsulta());
            return agendaRepository.save(agenda);
        }).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletarAgenda(@PathVariable Long id) {
        agendaRepository.deleteById(id);
    }
}
