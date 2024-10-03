package no.hvl.dat100.tabeller;

public class Tabeller {

	 // a) Skriver ut en tabell med heltall
    public static void skrivUt(int[] tabell) {
        if (tabell == null || tabell.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i]);
            if (i < tabell.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // b) Returnerer en streng-representasjon av tabellen
    public static String tilStreng(int[] tabell) {
        if (tabell == null || tabell.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < tabell.length; i++) {
            sb.append(tabell[i]);
            if (i < tabell.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // c) Beregner summen av tallene i tabellen
    public static int summer(int[] tabell) {
        int sum = 0;
        for (int tall : tabell) {
            sum += tall;
        }
        return sum;
    }

    // d) Sjekker om et tall finnes i tabellen
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int t : tabell) {
            if (t == tall) {
                return true;
            }
        }
        return false;
    }

    // e) Finner posisjonen til et tall i tabellen
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f) Reverserer rekkefølgen av elementene i tabellen
    public static int[] reverser(int[] tabell) {
        int[] reversert = new int[tabell.length];
        for (int i = 0; i < tabell.length; i++) {
            reversert[i] = tabell[tabell.length - 1 - i];
        }
        return reversert;
    }

    // g) Sjekker om tabellen er sortert stigende
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] <= tabell[i-1]) {
                return false;
            }
        }
        return true;
    }

    // h) Setter sammen to tabeller
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] sammenSatt = new int[tabell1.length + tabell2.length];
        System.arraycopy(tabell1, 0, sammenSatt, 0, tabell1.length);
        System.arraycopy(tabell2, 0, sammenSatt, tabell1.length, tabell2.length);
        return sammenSatt;
    }

    // Hovedmetode for å teste funksjonene
    public static void main(String[] args) {
        int[] testTabell = {42, 67, 89};
        
        System.out.println("Test av skrivUt:");
        skrivUt(testTabell);
        
        System.out.println("\nTest av tilStreng:");
        System.out.println(tilStreng(testTabell));
        
        System.out.println("\nTest av summer:");
        System.out.println("Sum: " + summer(testTabell));
        
        System.out.println("\nTest av finnesTall:");
        System.out.println("Finnes 67? " + finnesTall(testTabell, 67));
        System.out.println("Finnes 100? " + finnesTall(testTabell, 100));
        
        System.out.println("\nTest av posisjonTall:");
        System.out.println("Posisjon av 89: " + posisjonTall(testTabell, 89));
        System.out.println("Posisjon av 100: " + posisjonTall(testTabell, 100));
        
        System.out.println("\nTest av reverser:");
        skrivUt(reverser(testTabell));
        
        System.out.println("\nTest av erSortert:");
        System.out.println("Er sortert: " + erSortert(testTabell));
        
        int[] testTabell2 = {90, 91, 92};
        System.out.println("\nTest av settSammen:");
        skrivUt(settSammen(testTabell, testTabell2));
    }
}
