package com.miempresa.entidad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {
	private Tienda tienda;
	@BeforeEach
	void setUp() throws Exception {
		tienda = new Tienda();
	}

	@Test
	void testAgregarProducto() {
		Producto p1 = new Producto("Tablet", 300);
		tienda.agregarProducto(p1);
		int resultadoesperado = 1;
		int resultado = tienda.obtenerProductos().size();
		assertEquals(resultadoesperado, resultado);
	}
	
	@Test
	void testCalcularPrecioTotal() {
		Producto p1 = new Producto("Tablet", 300);
		tienda.agregarProducto(p1);
		Producto p2 = new Producto("Movil", 150);
		tienda.agregarProducto(p2);
		double resultadoesperado = 450.0;
		double resultado = tienda.calcularPrecioTotal();
		assertEquals(resultadoesperado, resultado);
	}
}
