package com.ejercicio.estructuras;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	@PostMapping("/parImpar")
	public String ejercicio1(@RequestParam int numero) {
		String ret = "";
		if (numero % 2 == 0) {
			ret += "Es par el " + numero;
		} else {
			ret += "Es impar el " + numero;
		}
		
		return "<h1>" + ret + "</h1>";
	}
	
	@PostMapping("/tablaMultiplicar")
	public String ejercicio2(@RequestParam int numero) {
		String tabla = "";
		int resultado = 0;
		
		for (int i = 0; i <= 10 ; i++) {
			resultado = numero * i;
			tabla += "<tr><td>" + numero + " x " + i + " = " + resultado + "</td></tr>";
		}
		
		return "<table border=1>" + tabla + "</table>";
	}
	
	@PostMapping("/promedioCalificaciones")
	public String ejercicio3(@RequestParam String calificaciones) {
		String tabla[] = calificaciones.split(",");
		int tabla2[] = new int[tabla.length]; 
		int promedio = 0;
		
		for (int i = 0; i < tabla.length; i++) {
			tabla2[i] = Integer.parseInt(tabla[i]);
			promedio += tabla2[i];
		}
		promedio = promedio / tabla2.length;
		
		return "<h1>" + "El promedio es: " + promedio + "</h1>";
	}
		
}
