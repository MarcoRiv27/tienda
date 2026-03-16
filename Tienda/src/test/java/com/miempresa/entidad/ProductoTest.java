package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	Producto producto;
	@BeforeEach
	void setUp() throws Exception{
		producto = new Producto("Manzana", 0.2);
	}
	@Test
	void testGetNombre() {
		String resultadoesperado = "Manzana";
		String resultadoactual = producto.getNombre();
		assertEquals(resultadoesperado, resultadoactual);
	}
	@Test
	void testSetNombre() {
		String resultadoesperado = "Pera";
		producto.setNombre("Pera");
		String resultadoactual = producto.getNombre();
		assertEquals(resultadoesperado, resultadoactual);
	}
	@Test
	void testSetPrecio() {
		double resultadoEsperado = 2.5;
		producto.setPrecio(2.5);
		double resultado = producto.getPrecio();
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	void testPrecioNegativo() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> producto.setPrecio(-8.0));
		String mensajeEsperado = "El precio no puede ser negativo: -8.0";
		String mensajeActual = exception.getMessage();
		assertEquals(mensajeEsperado, mensajeActual);
	}
}

