package com.software.calzados;

import com.software.calzados.dao.ModeloDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalzadosApplicationTests {

	@Autowired
	ModeloDao modeloDao;
	
	@Test
	void contextLoads() {
	}

}
