package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        Tuomari tuomari = new Tuomari();
        Tekoaly tekoaly = new Tekoaly();

        while (true) {
            if (!vuoro(tuomari, tekoaly)) {
                break;
            }
        }
        System.out.println("\nKiitos!");
        System.out.println(tuomari);
    }

    private static boolean vuoro(Tuomari tuomari, Tekoaly tekoaly) {
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