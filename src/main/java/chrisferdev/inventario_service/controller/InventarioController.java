package chrisferdev.inventario_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import chrisferdev.inventario_service.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping("/{codigoSku}")
    public boolean isInStock(@PathVariable("codigoSku") String codigoSku){
        return inventarioService.isInStock(codigoSku);
    }
}
