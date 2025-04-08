package consulta.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import consulta.com.example.demo.model.Secretaria;

public interface SecretariaRepository extends JpaRepository<Secretaria, Long> {
}