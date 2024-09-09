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
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Marca;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.Modelo;


@Entity
@Data
@Table(name = "repuestos")
public class repuestos {
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

    @Column(name = "precio", columnDefinition = "decimal(10,2)")
    @NotNull
    private String precio;

    @Column(name = "stock", columnDefinition = "int")
    @NotNull
    private String stock;

    @ManyToOne
    @JoinColumn(name = "proveedor_id")
    @NotNull
    private proveedores proveedor;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    @NotNull
    private Modelo modelo_id;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    @NotNull
    private Marca marcas_id;

}

