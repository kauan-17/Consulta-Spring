package consulta.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import consulta.com.example.demo.model.Consulta;
import java.util.List;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByPacienteId(Long pacienteId);
    List<Consulta> findBySecretariaId(Long secretariaId);
    List<Consulta> findByNomeDentista(String nomeDentista);
}
