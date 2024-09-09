// src/main/java/proyecto_encuesta/pr_encuesta/bicicletas/controller/BicicletaController.java
package proyecto_encuesta.pr_encuesta.bicicletas.infrastructure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.*;
import proyecto_encuesta.pr_encuesta.bicicletas.application.service.*;

import java.util.List;

@RestController
@RequestMapping("/api/bicicletas")
public class BicicletaController {

    @Autowired
    private BicicletaService bicicletaService;

    @GetMapping
    public List<Bicicletas> getAllBicicletas() {
        return bicicletaService.getAllBicicletas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Bicicletas> getBicicletaById(@PathVariable Long id) {
        Bicicletas bicicleta = bicicletaService.getBicicletaById(id);
        if (bicicleta != null) {
            return ResponseEntity.ok(bicicleta);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public Bicicletas createBicicleta(@RequestBody Bicicletas bicicleta) {
        return bicicletaService.saveBicicleta(bicicleta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Bicicletas> updateBicicleta(@PathVariable Long id, @RequestBody Bicicletas bicicletaDetails) {
        Bicicletas updatedBicicleta = bicicletaService.updateBicicleta(id, bicicletaDetails);
        if (updatedBicicleta != null) {
            return ResponseEntity.ok(updatedBicicleta);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBicicleta(@PathVariable Long id) {
        bicicletaService.deleteBicicleta(id);
        return ResponseEntity.ok().build();
    }
}