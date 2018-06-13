package modelo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cuadrado {
	public static  int calcularArea(int lado){
		int area = 0;
		area = lado * lado;
		return area;
	}
	public static int calcularPerimetro(int lado){
		int perimetro = 0;
		perimetro = (int) Math.sqrt(calcularArea(lado))*4;
		return perimetro;
	}
	public static String entrada(){
		@SuppressWarnings("unused")
		String entra = "";
		StringBuffer str=new StringBuffer();
        char c;
        try{
            Reader entrada=new InputStreamReader(System.in);
            while ((c=(char)entrada.read())!='\n'){
                str.append(c);
            }
        }catch(IOException ex){}
        return entra = str.toString();
	}
	
}
