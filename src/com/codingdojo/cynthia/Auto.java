package com.codingdojo.cynthia;

public class Auto extends Vehiculo implements ManejarVehiculo{
	
	private String placas;

	public Auto(int anio, String marca, String modelo, String color, int ruedas, String placas) {
		super(anio, marca, modelo, color, ruedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	//Polimorfismo: el tener el mismo método a través de clases PERO con distintos comportamientos
	public void imprimir() {
		//System.out.println("El auto es del año:"+this.getAnio()+" Marca:"+this.getMarca()+" Modelo:"+this.getModelo()+" Placas:"+this.placas);
		super.imprimir();
		System.out.println("Placas:"+this.placas);
	}
	
	public void acelerar() {
		System.out.println("Voy a acelerar!");
		velocidad += aumento;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Voy a bajar mi velocidad!");
		velocidad -= aumento;
		System.out.println("Mi velocidad es de: "+velocidad);
	}
	
	
}
