package chrisferdev.inventario_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import chrisferdev.inventario_service.repository.InventarioRepository;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    @Transactional(readOnly = true)
    public boolean isInStock(String codigoSku){
        return inventarioRepository.findByCodigoSku(codigoSku).isPresent();
    }
}
