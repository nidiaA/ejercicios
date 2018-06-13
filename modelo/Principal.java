package modelo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal extends Cubo{
	private static Cuadrado cuadrado;
	private static Cubo cubo;
	@SuppressWarnings({ "static-access", "static-access", "static-access" })
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Escribe la Medida de uno de los lado\n");
		int lado = 0;
		lado = sn.nextInt();
	       boolean salir = false;
	       boolean regresar = false;
	       int select =-1;
	       int opcion; //Guardaremos la opcion del usuario
	       sn = new Scanner(System.in);
	       while(!salir){
	    	   
	    	   System.out.println("1. Cubo");
	           System.out.println("2. Cuadrado");
	           System.out.println("0. Salir");
	           select = Integer.parseInt(sn.nextLine());
	           switch (select) {
		           case 1:
		        	   while(!regresar){
			        	   System.out.println("1. Calcular Volumen");
				           System.out.println("2. Calcular Perimetro");
				           System.out.println("3. Cancelar");
				           
				           try {
				        	   Scanner scan = new Scanner(System.in);
				                System.out.println("Escribe una de las opciones\n");
				                opcion = scan.nextInt();
				                
				                switch (opcion) {
				                    case 1:
				                        System.out.println("El volumen de un cubo es: " +calcularVolumen(lado)+"\n");
				                        break;
				                    case 2:
				                        System.out.println("El perimetro de un cubo es: "+calcularPerimetroCubo(lado)+"\n");
				                        break;
				                    case 3:
				                    	regresar = true;
				                        break;
				                    default:
				                        System.out.println("Solo números entre 1 y 3 \n");
				                }
				           	}catch (InputMismatchException e) {
				                System.out.println("Debes insertar un número");
				                sn.next();
				            }
		        	   }
		        	   break;
		        	   
		           case 2:
		        	   while(!regresar){
				           System.out.println("1. Calcular Area del Cuadrado");
				           System.out.println("2. Calcular Perimetro del Cuadrado");
				           System.out.println("3. Cancelar");
				           
				           try {
				        	   Scanner scan = new Scanner(System.in);
				                System.out.println("Escribe una de las opciones\n");
				                opcion = scan.nextInt();
				                
				                switch (opcion) {
				                    case 1:
				                        System.out.println("El area de un cuadrado es: " +cuadrado.calcularArea(lado));
				                        break;
				                    case 2:
				                        System.out.println("El perimetro de un cuadrado es: "+cuadrado.calcularPerimetro(lado));
				                        break;
				                    case 3:
				                    	regresar = true;
				                        break;
				                    default:
				                        System.out.println("Solo números entre 1 y 3\n");
				                }
				            } catch (InputMismatchException e) {
				                System.out.println("Debes insertar un número");
				                sn.next();
				            }
		        	   }
		        	   break;
		           case 0:
		        	   salir = true;
		        	   break;
	
		           default:
		        	   break;
				}
	           
	           
	       }

	}

}
