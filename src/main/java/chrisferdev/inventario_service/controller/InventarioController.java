package chrisferdev.inventario_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import chrisferdev.inventario_service.dto.InventarioResponse;
import chrisferdev.inventario_service.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventarioResponse> isInStock(@RequestParam List<String> codigoSku){
        return inventarioService.isInStock(codigoSku);
    }
}
