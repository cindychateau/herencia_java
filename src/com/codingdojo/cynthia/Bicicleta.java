package com.codingdojo.cynthia;

public class Bicicleta extends Vehiculo implements ManejarVehiculo {

	public Bicicleta(int anio, String marca, String modelo, String color, int ruedas) {
		super(anio, marca, modelo, color, ruedas);
		// TODO Auto-generated constructor stub
	}

	public void acelerar() {
		System.out.println("Voy a pedalear más rápido");
		velocidad += 1;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Voy a bajar mi velocidad bajando poco a poco mis pies");
		velocidad -= 1;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
}
