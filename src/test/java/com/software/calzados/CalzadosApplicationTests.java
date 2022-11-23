package com.software.calzados;

import com.software.calzados.dao.ColorDao;
import com.software.calzados.dao.ModeloDao;

import com.software.calzados.models.Color;
import com.software.calzados.models.Defecto;
import com.software.calzados.models.Estado;
import com.software.calzados.models.OrdenProduccion;
import org.junit.jupiter.api.*;
import org.junit.jupiter.engine.config.JupiterConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
class CalzadosApplicationTests {
	static Color color;
	static Estado estado;

	@Autowired
	ColorDao colorDao;

	@BeforeAll
	static void beforeAll() {
		color = new Color();
		color.setDescripcion("verdoso");


	}

	@Test
	void creacion_de_color() {
		Color color1 = colorDao.newColor(color);
		System.out.println(color1.getDescripcion());
		Assertions.assertEquals(color1.getDescripcion(),"naranja");
	}

//	@Test
//	void crear_orden_de_produccion() {
//		OrdenProduccion ordenProduccion = new OrdenProduccion();
//		ordenProduccion.setColor(color);
//		ordenProduccion.setEstado(estado.INICIADA);
//		System.out.println(color.getDescripcion());
//		Assertions.assertEquals(4,4);
//	}

}
