package proyecto_encuesta.pr_encuesta.bicicletas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {
}
