package proyecto_encuesta.pr_encuesta.bicicletas.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
@Table(name = "bicicletas")
public class Bicicletas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    @NotNull
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    @NotNull
    private Marca marca;

    @NotNull
    private Double precio;

    @NotNull
    private Integer stock;

}