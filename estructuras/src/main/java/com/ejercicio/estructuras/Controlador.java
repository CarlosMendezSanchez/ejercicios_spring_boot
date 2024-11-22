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
}
