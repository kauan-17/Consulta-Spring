package consulta.com.example.demo.controller;

import consulta.com.example.demo.model.Agenda;
import consulta.com.example.demo.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendas")
public class AgendaController {

    private final AgendaRepository agendaRepository;

    @Autowired
    public AgendaController(AgendaRepository agendaRepository) {
        this.agendaRepository = agendaRepository;
    }

    @GetMapping
    public List<Agenda> listarAgendas() {
        return agendaRepository.findAll();
    }
}
