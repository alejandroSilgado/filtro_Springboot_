package proyecto_encuesta.pr_encuesta.bicicletas.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "modelo")
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @Column(name = "nombre", columnDefinition = "varchar(100)")
    @NotNull
    private String nombre;

    @Column(name = "descripcion", columnDefinition = "varchar(200)")
    @NotNull
    private String descripcion;
}

