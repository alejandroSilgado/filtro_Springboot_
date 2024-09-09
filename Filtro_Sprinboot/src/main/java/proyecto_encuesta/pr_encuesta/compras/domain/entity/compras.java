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
@Table(name = "compras")
public class compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @Column(name = "fecha", columnDefinition = "date")
    @NotNull
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    @NotNull
    private proveedores proveedores_id;

    @Column(name = "total", columnDefinition = "decimal(10,2)")
    @NotNull
    private String total;

}

