package calc;

public class MotsUtils {

	public static String inverser(String str) {

		//		 int longueurMots = str.length();
		//		 
		//		 
		//		 String strf ="";
		//		 
		//		 
		//		 for (int i = 0; i < longueurMots; i++) {
		//			
		//			strf = strf + str.charAt(longueurMots-i-1);
		//		}
		//		 
		//		return strf;


		int fin = str.length();

		String str1 = new String();

		//				for(int i=0; i<test.length; i++)
		//				{
		//					test[i] = str.charAt(i);
		//				}

		char[] test1 = str.toCharArray();

		for(int i=fin-1; i>=0; i--)
		{
			System.out.println("*****************************");
			System.out.println("i = "+i);
			System.out.println("str1 avant = "+str1);
			str1 = str1 + test1[i];
			System.out.println("str1 apres = "+str1);
			System.out.println("*****************************");
		}

		return str1;
	}

	public static String caracteresCommuns(String str, String str2) {

		String chaine ="";

		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {

				if(str.charAt(i)==str2.charAt(j)) {
					if(chaine.indexOf(str.charAt(i)) == -1){



						System.out.println("*****************************");
						System.out.println("i = "+i);
						System.out.println("j = "+j);
						System.out.println("str avant = "+str);
						System.out.println("str1 avant = "+str2);

						chaine = chaine + str.charAt(i);

						System.out.println("str apres = "+str);
						System.out.println("str2 apres = "+str2);
						System.out.println("chaine = " +chaine);
						System.out.println("*****************************");
					}
				}

			}

		}

		return chaine;

	}

	public static boolean estUnPalindrome(String str) {

		//		return str.equals(inverser(str));


		if (str.equals(inverser(str))) {

			return true;
		}
		else {
			return false;
		}
	}

	public static long sommeChiffresDansMot(String str) {


		String mystr2 = str.replaceAll( "[^\\d]", "" );
		System.out.println(mystr2);
		long numero= Integer.parseInt(mystr2);

		long somme = 0;

		while ( numero != 0) {
			somme += numero % 10;
			System.out.println(somme);
			System.out.println("***********************");
			numero = numero /10;
			System.out.println(numero);
		}
		return somme;





		//		long som = 0;
		//
		//		char[] charArray = str.toCharArray();
		//
		//		for(char c : charArray) {
		//			if (Character.isDigit(c)) {
		//				som = som+Character.getNumericValue(c);
		//			}
		//		}
		//		return som;

		//		  long som = 0;
		//	        int a=0;
		//	        for (int i=0;i<str.length();i++) {
		//	            char monchar = str.charAt(i);
		//	            if (Character.isDigit(monchar)) {
		//	                a=Character.getNumericValue(monchar);
		//	                som=som+a;
		//	            }
		//	        }
		//	        return som;    


	}

	public static String devinerAlgo(int param) {

		int cal = param * 2;
		int call = param -1;
		String str = String.valueOf(cal);
		String str1 = String.valueOf(call);
		String rse =str +str1;

		//		 return "" + 2*param + (param-1);

		return rse;


	}

	public static void afficherNombreOccurence(String str) {




		int i, nombre ;
		char lettre ;


		for (lettre=(char) 65; lettre<= 90; lettre++)
		{
			nombre=0;
			for(i=0; i<str.length(); i++)
			{
				if (lettre == str.charAt(i) || (lettre + 32) == str.charAt(i))
				{
					nombre++;
				}
			}
			if (nombre > 0)
			{
				System.out.println(lettre +" = "+nombre);
			}
		}   

	}

	public static String exercice29(int param, int param2) {


		//		String s = ""; 
		//		if (param % 2 == 1) {
		//			for (int i = 0; i < param2; i++) {
		//				param = param +2;
		//				System.out.println(param);
		//				s= s + "*" + param;
		//				System.out.println(s);
		//			}
		//		}else {
		//			param = param +1;
		//			for (int i = 0; i < param2; i++) {
		//				param = param +2;
		//				s= s + "*" + param;
		//			}
		//		}

		String s = ""; 
		if(param %2 == 1) {
			param = param +2;
		}else {
			param =param +1;
		}
		s=s+param;
		for (int i = 1; i < param2; i++) {
			param = param +2 ;
			s= s + "*" + param;
		}
		return s;
	}

	public static long sommeUnicodes(String str) {

		long b =0;
		for (int i = 0; i < str.length(); i++) {

			b = b + str.charAt(i);

		}

		return b;
	}
//	Exeplication de l'exercice numero 26
	public static void main(String[] args) {
		char monChar = 'v';
		System.out.println("la valeur en caractere actuelle : "+monChar);
		int deuxPasApresMonChar = monChar + 2; 
		System.out.println("deuxPasApresMonChar en nombre: "+deuxPasApresMonChar);
		System.out.println("deuxPasApresMonChar en caractere : "+ (char)deuxPasApresMonChar);
	}

}







