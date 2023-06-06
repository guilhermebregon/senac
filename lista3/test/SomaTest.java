package br.sc.senac.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaTest {

	@Test
	void test() {
		int x=2;
		int y=2;
		int resultadoAtual = Soma.soma(x, y);
		int resultadoEsperado = 4;		
		assertEquals(resultadoEsperado, resultadoAtual);
	}

}
