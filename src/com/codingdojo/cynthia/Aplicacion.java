package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		
		Vehiculo barco = new Vehiculo(2015, "Barco123", "ModeloBarquil", "Blanco", 0);
		barco.imprimir();
		
		Auto auto1 = new Auto(2010, "Honda", "Civic", "Rojo", 4, "ABC123");
		auto1.imprimir();
		
		auto1.acelerar();
		auto1.acelerar();
		auto1.desacelerar();
		
		Bicicleta bici = new Bicicleta(2020, "Marca de Bici", "Modelo 123", "Rosa", 2);
		bici.acelerar();
		bici.acelerar();
		bici.acelerar();
		bici.desacelerar();
		bici.manejar();
		
	}

}
