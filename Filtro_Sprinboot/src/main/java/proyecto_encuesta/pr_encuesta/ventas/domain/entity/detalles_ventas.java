package proyecto_encuesta.pr_encuesta.ventas.domain.entity;

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
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Bicicletas;

@Entity
@Data
@Table(name = "detalles_ventas")
public class detalles_ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "venta_id")
    @NotNull
    private ventas ventas_id;

    @ManyToOne
    @JoinColumn(name = "bicicleta_id")
    @NotNull
    private Bicicletas bicicleta_id;

    @Column(name = "cantidad", columnDefinition = "int")
    @NotNull
    private Integer cantidad;
    
    @Column(name = "precio_unitario", columnDefinition = "decimal(10,2)")
    @NotNull
    private Double precio_unitario;
}


