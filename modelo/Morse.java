package modelo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Morse {
	public static void main(String[] args) {
		System.out.println("Ingresa la palabra o codigo morse que deseas convertir?");
		String palabra;
		StringBuffer str=new StringBuffer();
	    char c;
	    try{
	        Reader entrada=new InputStreamReader(System.in);
	        while ((c=(char)entrada.read())!='\n'){
	            str.append(c);
	        }
	    }catch(IOException ex){}
	    palabra = str.toString().toUpperCase();
	    char[] array = palabra.toCharArray();
		String[] separaPalabra = palabra.split(" ");
		Map<String,String> cat = new HashMap<>();
		cat = catalogo();
		String conversion = "";
		if (array[0] == '.' || array[0] == '-') {
			for (int j = 0; j < separaPalabra.length; j++) {
				if (cat.get("" + separaPalabra[j]) != null){
					conversion += cat.get("" + separaPalabra[j]);
				}else{
					conversion += " ";
				}
			}
			System.out.println("DE MORSE A PALABRAS:   "+conversion);
		}else{
			for (int i = 0; i < array.length; i++) {
				if (cat.get("" + array[i]) != null){
					conversion += cat.get("" + array[i])+" ";
				}else{
					conversion += "  ";
				}
				
			}
			System.out.println("DE PALABRAS A CODIGO MORSE:   "+conversion);
		}
	}
	
	public static Map<String,String> catalogo(){
		Map<String,String> mapa = new HashMap<String, String>();
		mapa.put("A", ".-");
		mapa.put("B", "-...");
		mapa.put("C", "-.-.");
		mapa.put("D", "-..");
		mapa.put("E", ".");
		mapa.put("F", "..-.");
		mapa.put("G", "--.");
		mapa.put("H", "....");
		mapa.put("I", "..");
		mapa.put("J", ".---");
		mapa.put("K", "-.-");
		mapa.put("L", ".-..");
		mapa.put("M", "--");
		mapa.put("N", "-.");
		mapa.put("O", "---");
		mapa.put("P", ".--.");
		mapa.put("Q", "--.-");
		mapa.put("R", ".-.");
		mapa.put("S", "...");
		mapa.put("T", "-");
		mapa.put("U", "..-");
		mapa.put("V", "...-");
		mapa.put("W", ".--");
		mapa.put("X", "-..-");
		mapa.put("Y", "-.--");
		mapa.put("Z", "--..");
		mapa.put("1", ".----");
		mapa.put("2", "..---");
		mapa.put("3", "...--");
		mapa.put("4", "....-");
		mapa.put("5", ".....");
		mapa.put("6", "-....");
		mapa.put("7", "--...");
		mapa.put("8", "---..");
		mapa.put("9", "----.");
		mapa.put("0", "-----");
		
		mapa.put(".-", "A");
		mapa.put("-...", "B");
		mapa.put("-.-.", "C");
		mapa.put("-..", "D");
		mapa.put(".", "E");
		mapa.put("..-.", "F");
		mapa.put("--.", "G");
		mapa.put("....", "H");
		mapa.put("..", "I");
		mapa.put(".---", "J");
		mapa.put("-.-", "K");
		mapa.put(".-..", "L");
		mapa.put("--", "M");
		mapa.put("-.", "N");
		mapa.put("---", "O");
		mapa.put(".--.", "P");
		mapa.put("--.-", "Q");
		mapa.put(".-.", "R");
		mapa.put("...", "S");
		mapa.put("-", "T");
		mapa.put("..-", "U");
		mapa.put("...-", "V");
		mapa.put(".--", "W");
		mapa.put("-..-", "X");
		mapa.put("-.--", "Y");
		mapa.put("--..", "Z");
		mapa.put(".----", "1");
		mapa.put("..---", "2");
		mapa.put("...--", "3");
		mapa.put("....-", "4");
		mapa.put(".....", "5");
		mapa.put("-....", "6");
		mapa.put("--...", "7");
		mapa.put("---..", "8");
		mapa.put("----.", "9");
		mapa.put("-----", "0");
		return mapa;
	}
}


