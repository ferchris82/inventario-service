package chrisferdev.inventario_service.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import chrisferdev.inventario_service.model.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {

    Optional<Inventario> findByCodigoSkuIn(List<String> codigoSku);
}
