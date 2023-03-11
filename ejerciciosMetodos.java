package miPrimerProyectoDeJava;

import java.util.Calendar;

public class miPrimeraClase {
	//
	static void areaTriangulo(double a,double b, double c){
		if(a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("Triagunlo no valido");
		}else {
		double s = (a + b + c) / 2;
		double area = Math.sqrt (s *(s-a)*(s-b)*(s-c));	
		System.out.println("El area del triangulo es: \n"  +area);
	} }
	
	static void radio(double r){
		double area = Math.PI * Math.pow(r,2);
		double circunferencia = 2 * Math.PI * r;
		System.out.println("Area del circulo es :" +area+  "\nLa circunferencia del circulo es :"+ circunferencia);
		
	}
	
	static void horaSistema() {
	Calendar calendario = Calendar.getInstance();
	int hora = calendario.get(Calendar.HOUR_OF_DAY);
	int minutos = calendario.get(Calendar.MINUTE);
	int segundos = calendario.get(Calendar.SECOND);
	System.out.println(hora + ":" + minutos + ":" + segundos);
	
	}
	
	static void segundos(int n) {
	int minuto = n / 60;
	int hora = minuto / 60;
	System.out.println("hora = "+ hora + ", minutos = " + minuto +", segundos = " + n);
		
	}
	
	static void volumenEsfera(double r) {
		double volumen = (4.0 / 3.0 ) * Math.PI * Math.pow(r, 3);
		System.out.println("El volumen de la esfera es :" +volumen);
	}
	
	static void volumenCono(double r, double h) {
		double volumen = (Math.PI * Math.pow(r, 2) * h) / 3.0;
		System.out.println("El volumen del cono es: " +volumen);
	}
	
	static void areaCubo(double l) {
		double area = 6 * Math.pow(l, 2 );
		System.out.println("Area del cubo es: " +area); 
	}
	
	static void añoBisiesto(int año) {
		if (año % 4 == 0) {
			if(año % 100 == 0)
				if(año % 400 == 0);
				System.out.println("Es bisiesto");
		}else { 
			System.out.println("No es bisiesto");
		}
	}

	
	static void palindromo(int numero) {
	    String numeroStr = Integer.toString(numero);

	    boolean esPalindromo = true;
	    for (int i = 0; i < numeroStr.length() / 2; i++) {
	        if (numeroStr.charAt(i) != numeroStr.charAt(numeroStr.length() - i - 1)) {
	            esPalindromo = false;
	            break;
	        }
	    }
	    
	    if (esPalindromo) {
	        System.out.println(numero + " es un número palíndromo.");
	    } else {
	        System.out.println(numero + " no es un número palíndromo.");
	    }
	}
	static void remover(String cadena) {
	    String sinEspacio = cadena.replaceAll("\\s+", "");
	    System.out.println(sinEspacio);
	}
	static void invertir(String cadena) {
		
	    String invertirCadena = "";
	    for (int i = cadena.length() - 1; i >= 0; i--) {
	        invertirCadena += cadena.charAt(i);
	    }
	    System.out.println("La cadena invertida es: " + invertirCadena);
	    
	}
	
	static void factorial(int n){
	    int resultado = 1;
	    if (n == 1) {
	        resultado = 1;
	    } else {
	        factorial(n - 1);
	        resultado = factorial(n - 1) * n ;
	    }
	    System.out.println("El factorial de " + n + " es " + resultado);
	}
	
	public static void main(String[] args) {
	
		areaTriangulo(5,6,10); 
		radio(5);
		horaSistema();
		segundos(3600);
		volumenEsfera(7);
		volumenCono(4,10);
		areaCubo(5);
		añoBisiesto(2020);
		palindromo(70);
		remover("Hola Mundo");
		String cadena = "Hola";
		invertir(cadena);
		factorial(5);
	}

}
