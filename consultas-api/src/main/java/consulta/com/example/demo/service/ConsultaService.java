package consulta.com.example.demo.service;

import consulta.com.example.demo.model.Consulta;
import consulta.com.example.demo.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository repository;

    public List<Consulta> listarTodas() {
        return repository.findAll();
    }

    public Consulta salvar(Consulta consulta) {
        return repository.save(consulta);
    }

    public Optional<Consulta> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Consulta atualizar(Long id, Consulta consulta) {
        consulta.setId(id);
        return repository.save(consulta);
    }
}
