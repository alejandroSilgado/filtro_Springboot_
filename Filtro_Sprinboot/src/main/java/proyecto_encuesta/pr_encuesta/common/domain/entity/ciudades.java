package proyecto_encuesta.pr_encuesta.common.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "ciudades")
public class ciudades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @Column(name = "nombre", columnDefinition = "varchar(100)")
    @NotNull
    private String nombre;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    @NotNull
    private paises pais_id;

}


