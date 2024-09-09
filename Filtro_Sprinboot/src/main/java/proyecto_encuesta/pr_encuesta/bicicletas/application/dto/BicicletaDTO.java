// src/main/java/proyecto_encuesta/pr_encuesta/bicicletas/dto/BicicletaDTO.java
package proyecto_encuesta.pr_encuesta.bicicletas.application.dto;

import lombok.Data;

@Data
public class BicicletaDTO {
    private Long modeloId;
    private Long marcaId;
    private String precio;
    private String stock;
}