package proyecto_encuesta.pr_encuesta.bicicletas.domain.entity;

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
import proyecto_encuesta.pr_encuesta.common.domain.entity.ciudades;


@Entity
@Data
@Table(name = "clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "int")
    private Long id;

    @Column(name = "nombre", columnDefinition = "varchar(100)")
    @NotNull
    private String nombre;

    @Column(name = "email", columnDefinition = "varchar(100)")
    @NotNull
    private String email;

    @Column(name = "telefono", columnDefinition = "bigint")
    @NotNull
    private Integer telefono;

    @Column(name = "password", columnDefinition = "varchar(100)")
    @NotNull
    private String password;

    @ManyToOne
    @JoinColumn(name = "ciudad_id")
    @NotNull
    private ciudades ciudad;

}


