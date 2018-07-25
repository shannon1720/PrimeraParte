package com.cenfotec.object.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cenfotec.object.CribaEratostenes;

public class CribaEratostenesTEST {
	
	
	
	
	CribaEratostenes miCriba=new CribaEratostenes();
//Este es un test que pregunta si n es mayor a 2 en ese caso tira una exception
	@Test(expected = Exception.class)
	public void esMayora2() throws Exception {
	assertFalse("No es un valor mayor a dos.",miCriba.esMayor2(2));
	}

}
