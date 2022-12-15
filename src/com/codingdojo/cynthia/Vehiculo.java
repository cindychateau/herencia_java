package com.codingdojo.cynthia;

public class Vehiculo {
	
	protected int anio; //protected nos deja accedar a las variables en herencia
	private String marca;
	private String modelo;
	private String color;
	private int ruedas;
	protected int velocidad = 0;
	
	public Vehiculo() {
	}

	public Vehiculo(String color) {
		this.color = color;
	}

	public Vehiculo(String color, int ruedas) {
		this.color = color;
		this.ruedas = ruedas;
	}

	public Vehiculo(int anio, String marca, String modelo, String color, int ruedas) {
		this.anio = anio;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.ruedas = ruedas;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	public void imprimir() {
        System.out.println("Año:"+this.anio+" Marca:"+this.marca+" Modelo:"+this.modelo+" Color:"+this.color+" Ruedas:"+this.ruedas);
    }
	
}
