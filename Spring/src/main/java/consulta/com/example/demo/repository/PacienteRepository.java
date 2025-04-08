package consulta.com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import consulta.com.example.demo.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
