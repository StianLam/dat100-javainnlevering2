package no.hvl.dat100.matriser;

public class Matriser {

	// a) Skriver ut en matrise med utvidede for-løkker
	 public static void skrivUt(int[][] matrise) {
	        for (int[] rad : matrise) {
	            for (int element : rad) {
	                System.out.print(element + " ");
	            }
	            System.out.println();
        }
    }

 // b) Returnerer en streng-representasjon av matrisen
	 public static String tilStreng(int[][] matrise) {
	        StringBuilder sb = new StringBuilder();
	        for (int[] rad : matrise) {
	            for (int element : rad) {
	                sb.append(element).append(" ");
	            }
	            sb.append("\n");
	        }
	        return sb.toString();
	    }

 // c) Skalerer alle elementer i matrisen med et gitt tall
	  public static int[][] skaler(int tall, int[][] matrise) {
	        int rader = matrise.length;
	        int kolonner = matrise[0].length;
	        int[][] nyMatrise = new int[rader][kolonner];
	        
	        for (int i = 0; i < rader; i++) {
	            for (int j = 0; j < kolonner; j++) {
	                nyMatrise[i][j] = tall * matrise[i][j];
	            }
	        }
	        return nyMatrise;
    }

    // d) Sjekker om to matriser er like
	  public static boolean erLik(int[][] mat1, int[][] mat2) {
	        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
	            return false;
	        }
	        
	        for (int i = 0; i < mat1.length; i++) {
	            for (int j = 0; j < mat1[i].length; j++) {
	                if (mat1[i][j] != mat2[i][j]) {
	                    return false;
	                }
	            }
	        }
	        return true;
	  }


// Ekstra oppgave: Speiling (transponering) av matrise
public static int[][] speile(int[][] matrise) {
    int rader = matrise.length;
    int kolonner = matrise[0].length;
    int[][] speilet = new int[kolonner][rader];
    
    for (int i = 0; i < rader; i++) {
        for (int j = 0; j < kolonner; j++) {
            speilet[j][i] = matrise[i][j];
        }
    }
    return speilet;
}

// Ekstra oppgave: Matrisemultiplikasjon
public static int[][] multipliser(int[][] a, int[][] b) {
    int raderA = a.length;
    int kolonnerA = a[0].length;
    int kolonnerB = b[0].length;
    int[][] resultat = new int[raderA][kolonnerB];
    
    for (int i = 0; i < raderA; i++) {
        for (int j = 0; j < kolonnerB; j++) {
            for (int k = 0; k < kolonnerA; k++) {
                resultat[i][j] += a[i][k] * b[k][j];
            }
        }
    }
    return resultat;
}
}