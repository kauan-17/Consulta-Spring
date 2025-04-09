package consulta.com.example.demo.repository;

import consulta.com.example.demo.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}
