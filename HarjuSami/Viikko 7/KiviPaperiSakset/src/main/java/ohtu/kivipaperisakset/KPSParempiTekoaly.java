package ohtu.kivipaperisakset;

import java.util.Scanner;

import java.util.Scanner;

// Kivi-Paperi-Sakset, jossa voidaan valita pelataanko vastustajaa
// vastaan vai ei
public class KPSParempiTekoaly {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        TekoalyParannettu tekoaly = new TekoalyParannettu(20);

        while (true) {
            if (!vuoro(tuomari, tekoaly)) { break; }
        }

        System.out.println("\nKiitos!");
        System.out.println(tuomari);
    }

    private static boolean vuoro(Tuomari tuomari, TekoalyParannettu tekoaly) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();
        String tokanSiirto = tekoaly.annaSiirto();

        System.out.println("Tietokone valitsi: " + tokanSiirto);
        if (!onkoOkSiirto(ekanSiirto)) { return false; }
        tuomari.kirjaaSiirto(ekanSiirto, tokanSiirto);
        System.out.println(tuomari);
        System.out.println();
        return true;
    }

    private static boolean onkoOkSiirto(String siirto) {
        return "k".equals(siirto) || "p".equals(siirto) || "s".equals(siirto);
    }
}
