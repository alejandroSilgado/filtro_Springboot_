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
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Clientes;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "venta")
public class ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int", nullable = false, unique = true)
    @NotNull
    private Long id;

    @Column(name = "fecha", columnDefinition = "date", nullable = false)
    @NotNull
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    @NotNull
    private Clientes cliente;

}

