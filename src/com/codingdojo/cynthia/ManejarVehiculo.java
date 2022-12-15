package com.codingdojo.cynthia;

public interface ManejarVehiculo {
	
	int aumento = 2;
	
	//3 Métodos que podemos usar
	//**Método Abstracto: son aquellos que OBLIGAMOS a nuestra clase a implementar**
	//Método Default: esos no necesitan ser implementados, porque los manejamos directamente en la interface
	//Métodos Estáticos: Métodos que pertenecen a la interface
	
	abstract void acelerar();
	abstract void desacelerar();
	
	default void manejar() {
		System.out.println("Estoy manejando mi vehiculo");
	}
}
