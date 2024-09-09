// src/main/java/proyecto_encuesta/pr_encuesta/bicicletas/domain/repository/BicicletasRepository.java
package proyecto_encuesta.pr_encuesta.bicicletas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Bicicletas;

public interface BicicletasRepository extends JpaRepository<Bicicletas, Long> {
}

