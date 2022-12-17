package ec.edu.itsqmet.product;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.product.carro.Carro;

@SpringBootTest
class BuilderApplicationTests {

	
	@Test
	void testBuilder() {
		
		//--------------------
		Carro carro = Carro.builder().cilindraje(2.0).build();
		Carro carro1 = Carro.builder().color("rojo").puertas(5).build();
		Carro carro2 = Carro.builder().cilindraje(3.2).color("verde").puertas(3).build();
		System.out.println(carro);
		System.out.println(carro1);
		System.out.println(carro2);
	}

}
