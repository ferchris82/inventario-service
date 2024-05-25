package chrisferdev.inventario_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import chrisferdev.inventario_service.model.Inventario;
import chrisferdev.inventario_service.repository.InventarioRepository;

@SpringBootApplication
public class InventarioServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventarioServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventarioRepository inventarioRepository){
		return args ->{
			Inventario inventario = new Inventario();
			inventario.setCodigoSku("iphone_12");
			inventario.setCantidad(100);

			Inventario inventario2 = new Inventario();
			inventario2.setCodigoSku("iphone_13_plus");
			inventario2.setCantidad(0);

			inventarioRepository.save(inventario);
			inventarioRepository.save(inventario2);
		};
	}
}
