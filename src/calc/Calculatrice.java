package calc;

import java.util.Random;

public class Calculatrice {

	public static int addition(int a,int b) {
		return a+b ;
	}

	public static int soustraction(int a, int b) {

		return a-b;
	}

	public static int multiplication(int a, int b) {

		return a*b;
	}

	public static int max(int a, int b) {
		int maxVal = 0;
		if(a>b) {
			maxVal = a;
		}else {
			maxVal = b;
		}
		return maxVal;
	}

	public static char signe(int a) {
		char resul = ' ';
		if (a >= 0) {
			resul = '+';
		}else {
			resul = '-';
		}

		return resul;
	}

	public static long factorielle(int parametreX) {

//		int facto = 1;
//		for (int i=1; i <= parametreX; i++){
//			facto = facto * i;
//	}
//		return facto;
		
//		if(parametreX == 0) {
//			return 1 ;
//		}else {
//			return (parametreX * factorielle (parametreX-1));
//		}
		
		int resultat = 1;
		int i = 1;
		while (i < parametreX) {
			System.out.println(i);
			i++;
			resultat = resultat * i;
		}
		return resultat;
	}

	public static boolean conjonction(boolean a, boolean b) {
		
		
		boolean c = a && b;
		return c;
		
	}

	public static boolean disjonction(boolean a, boolean b) {
		
		return a || b ;
	}

	public static boolean negation(boolean boolA) {
		
		return !boolA;
	}

	public static int aleatoireInferieur(int max) {

		
		Random rad = new Random();
		int rad1 = rad.nextInt(max);
		

		return rad1;
	}

	public static int binaire(String nbr1) {
		int dec =0 ;
		int bit;
		
		for (int i = nbr1.length(),j =0; i >0; i--,j++) {
			
			System.out.println(i);
			
			bit = Character.getNumericValue(nbr1.charAt(i-1));
			
			System.out.println("**************");
			System.out.println(i);
			
			dec +=bit*Math.pow(2, j);
			
			
		}
		
		return dec;
	}


	public static String exercice30(String nbr) {
		
		int E = 0 ;
		int D =0 ;
		
		if (nbr.indexOf('.') != -1) {
			for (int i = nbr.length(); i >=0 ; i--) {
				if(nbr.charAt(i) == '.') {
					break;
				}
				D = D +(int) nbr.charAt(i) -48;
				
			}
		}

		for (int i = 0; i < nbr.length(); i++) {
			if (nbr.charAt(i) == '.' ) {
				break;
			}
			E = E + (int) nbr.charAt(i) -48;

		}

		return "T" + (E + D) + "E" + (E) + "D" + (D);

	}

	public static String exercice31(String a) {
		
		a=a.toUpperCase();
		String resulta ="";
		
		char letter;
		for (int i = 0; i < a.length(); i++){
			for(letter =(char) 65 ; letter <= 90 ;letter++) {
				if(a.charAt(i)== letter) {
					resulta = ""+ resulta + ((int)letter-64);
				}
				System.out.println(letter);
				System.out.println(resulta);
				System.out.println("*********************************");
			}
		}
		
		return resulta;
	}
		
	}




