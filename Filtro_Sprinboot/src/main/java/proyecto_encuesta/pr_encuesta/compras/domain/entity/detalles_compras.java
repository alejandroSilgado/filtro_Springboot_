package proyecto_encuesta.pr_encuesta.compras.domain.entity;

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

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "detalles_compras")
public class detalles_compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @Column(name = "fecha", columnDefinition = "date")
    @NotNull
    private LocalDateTime fecha;
    
    @ManyToOne
    @JoinColumn(name = "compra_id")
    @NotNull
    private compras compra_id;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    @NotNull
    private repuestos repuesto_id;

    @Column(name = "cantidad", columnDefinition = "int")
    @NotNull
    private Integer cantidad;
    
    @Column(name = "precio_unitario", columnDefinition = "decimal(10,2)")
    @NotNull
    private Double precio_unitario;
}

