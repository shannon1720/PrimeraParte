package com.cenfotec.object.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.object.CribaEratostenes;

public class CribaEratostenesTEST {
	
	
	
	
    //Este es un test que pregunta si n es mayor a 2 en ese caso tira una exception
	@Test(expected = Exception.class)
	public void esMayora2() throws Exception {
	assertTrue("No es un valor mayor a dos",CribaEratostenes.esMayor2(2));
	}
	//Este test verifica si es es igual o mayor a 2 
	@Test
	public void esMayor() throws Exception {
		assertTrue(CribaEratostenes.esMayor2(3));
	}
	//En este  se va a valorar que devuelva la cantidad de 1s segun el tope que sera 100
	@Test
	public void obtieneBienPrimos() throws Exception {			
		assertEquals(25,CribaEratostenes.generaCriba(100).length);
	}	
	@Test 
	public void contarPrimis() {
		boolean primo[]= {false, false, true, true, false, true, false, true, false, false, false};
		assertEquals(4,CribaEratostenes.cuentaPrimos(11, primo));
	}
	
	//genera un arreglo de 1 y los retorna en este caso se lee length
	@Test
	public void imprimirUnos() throws Exception {
		CribaEratostenes.generaCriba(10);
		
		boolean primo[]= {false, false, true, true, false, true, false, true, false, false, false};
		assertEquals(4,CribaEratostenes.crearArreglode1(11, primo, 4).length);		
		
	}
	
	//Genera un arreglo de los numeros primosy los retorna en este caso se comparan
	@Test
	public void imprimirPrimos() throws Exception {
		CribaEratostenes.generaCriba(10);
		boolean primo[]= {false, false, true, true, false, true, false, true, false, false, false};
		int []primos= {2,3,5,7};
		int []primis=CribaEratostenes.crearArregloPrimosDeN(11, primo, 4);
		for(int i=0;i<primis.length;i++) {
		assertEquals(primos[i],primis[i]);		
		}
	}
}
