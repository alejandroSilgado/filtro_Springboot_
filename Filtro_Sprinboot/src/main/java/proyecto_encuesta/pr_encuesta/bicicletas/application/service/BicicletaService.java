package proyecto_encuesta.pr_encuesta.bicicletas.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.entity.*;
import proyecto_encuesta.pr_encuesta.bicicletas.domain.repository.*;

import java.util.List;

@Service
public class BicicletaService {
    @Autowired
    private BicicletasRepository bicicletaRepository;

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private MarcaRepository marcaRepository;

    public List<Bicicletas> getAllBicicletas() {
        return bicicletaRepository.findAll();
    }

    public Bicicletas getBicicletaById(Long id) {
        return bicicletaRepository.findById(id).orElse(null);
    }

    public Bicicletas saveBicicleta(Bicicletas bicicleta) {
        return bicicletaRepository.save(bicicleta);
    }

    public void deleteBicicleta(Long id) {
        bicicletaRepository.deleteById(id);
    }

    public Bicicletas updateBicicleta(Long id, Bicicletas bicicletaDetails) {
        Bicicletas bicicleta = bicicletaRepository.findById(id).orElse(null);
        if (bicicleta != null) {
            bicicleta.setModelo(modeloRepository.findById(bicicletaDetails.getModelo().getId()).orElse(null));
            bicicleta.setMarca(marcaRepository.findById(bicicletaDetails.getMarca().getId()).orElse(null));
            bicicleta.setPrecio(bicicletaDetails.getPrecio());
            bicicleta.setStock(bicicletaDetails.getStock());
            return bicicletaRepository.save(bicicleta);
        }
        return null;
    }
}
