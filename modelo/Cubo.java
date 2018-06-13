package modelo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cubo extends Cuadrado{
	public static int calcularVolumen(int lado){
		int volumen = calcularArea(lado)*lado;
		return volumen;
	}
	
	public static int calcularPerimetroCubo(int lado){
		int perimetro = 0;
		perimetro = (int) Math.sqrt(calcularArea(lado))*12;
		return perimetro;
	}
}
