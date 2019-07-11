package calc;

public class CalculatriceTableau {

	public static int sommeElements(int[] tabInt) {
		int somme = 0;
		for(int i = 0; i < tabInt.length; i++){
			somme = somme + tabInt[i];
		}
		return somme;	 
	}

	public static int plusPetitElement(int[] tabInt) {

		//		 int maxVal = Integer.MAX_VALUE;
		//	       int minVal = Integer.MIN_VALUE;
		//	       
		//		 for(int i = 0; i < tabInt.length; i++){
		//	         if(tabInt[i] < maxVal)
		//	           maxVal = tabInt[i];
		//	         if(tabInt[i] > minVal)
		//	           minVal = tabInt[i];
		//	       }
		//		return maxVal;

		int mini = Integer.MAX_VALUE;
		for (int i = 0; i<tabInt.length; i++) {
			System.out.println("***************************************");
			System.out.println("i = "+i);
			System.out.println("mini avant compare : "+mini);
			System.out.println("tab[i] : "+tabInt[i]);
			if (mini>tabInt [i]) {
				mini = tabInt[i];
			}
			System.out.println("mini apres compare : "+mini);
			System.out.println("***************************************");
		}
		return mini;
	}




	public static int plusGrandElement(int[] tabInt) {

		//		 int maxVal = Integer.MAX_VALUE;
		int minVal = Integer.MIN_VALUE;

		for(int i = 0; i < tabInt.length; i++){
			//	         if(tabInt[i] < maxVal)
			//	           maxVal = tabInt[i];
			if(tabInt[i] > minVal)
				minVal = tabInt[i];
		}
		return minVal;
	}

	public static long sommeElementsDeuxTableaux(int[] tabInt, int[] tabInt2) {
		int somme = 0;
		int somme1 = 0;
		int somme2 = 0;

		for(int i = 0; i < tabInt.length; i++){
			somme1 = somme1 + tabInt[i];
		}
		for(int i = 0; i < tabInt2.length; i++){
			somme2 = somme2 + tabInt[i];
		}
		return somme1+somme2;
	}

	public static int[] triAscendant(int[] tabInt ) {

		for (int i = 0 ; i< tabInt.length; i++) {
			for (int j = 0; j < tabInt.length; j ++) {
				if (tabInt[j]< tabInt[i]) {
		
					int tri = tabInt[i];
					tabInt[i]= tabInt[j];
					tabInt[j]= tri;
				}
			}
			
		}
		return tabInt;
	}

	public static boolean conjonction(boolean[] tabBool) {

		boolean n = true;
		for (int i = 0 ; n && i < tabBool.length ; i++){

			n = n &&  tabBool[i];

		}
		return n ;

		//		boolean n = true;
		//		for (int i = 0 ; i < tabBool.length ; i++){
		//			if( n == true) {
		//				n = n &&  tabBool[i];
		//			}else {
		//				break;
		//			}
		//			
		//			
		//			}
		//		return n ;


		//		int i =0 ;
		//		while (n && (i+1 < tabBool.length)) {
		//			
		//			n = tabBool[i] && tabBool[i+1];
		//			i = i+1;
		//		}
		//		return n;

	}

	public static long nombreDElementsPair(int[] tab) {
		int c = 0;
		for (int i=0; i<tab.length; i++) {
//			if(tab[i]%2 == 0) {
//				c= c+1;
//			}
			c = (tab[i]%2 == 0)?c+1:c;
		}
		return c;
		
		

	}

	public static boolean chercheSiUnElementExiste(int param, int[] tab) {
		
		boolean b = true;
		  for(int i = 0 ; i<tab.length;i++){
			   if(param==tab[i]) {
				   b = b;
				   break;
			   }else {
				   b=false;
			   }
				
			     
			     
	}
		  return b;
	}

	public static int[] mettreZeroDansLesCasesAIndicesImpair(int[] tab) {
		for(int i = 0 ; i<tab.length;i++){
			tab[i] = (tab[i]%2 == 0) ? tab[i]:0;
		}
		return tab;
	}

	public static int[] decalerLesElementsTableauDUneCase(int[] tableau) {

		int derniereCase = tableau[tableau.length - 1];
		
		for(int i=1; i<tableau.length; i++) {
			tableau[tableau.length - i] = tableau[tableau.length - i - 1];
		}
		
		tableau[0]= derniereCase;
		
		return tableau;
		
		 
	}

	public static int[] triAscendantDeuxTableaux(int[] tabInt, int[] tabInt2) {

		int[] d = new int[tabInt.length +tabInt2.length];

		for (int i = 0; i < tabInt.length; i++) {
			d[i] = tabInt[i];
		}

		for (int i = 0; i < tabInt2.length; i++) {
			d[i + tabInt.length] = tabInt2[i];
		}

	return triAscendant(d);
		
		
	}
}
