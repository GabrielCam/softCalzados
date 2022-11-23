package com.software.calzados;

import com.software.calzados.dao.ColorDao;

import com.software.calzados.models.Color;
import com.software.calzados.models.Estado;
import org.junit.jupiter.api.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalzadosApplicationTests {
	static Color color;
	static Estado estado;

	@Autowired
	ColorDao colorDao;

	@BeforeAll
	static void beforeAll() {
		color = new Color();
		color.setDescripcion("rojito");


	}

	@Test
	void creacion_de_color() {
		Color color1 = colorDao.newColor(color);
		Assertions.assertEquals(color1.getDescripcion(),"rojito");
	}

	@Test
	void getColorById() {
		Color color = colorDao.getColorById(1);
		Assertions.assertEquals(color.getCodigo(),1);
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
