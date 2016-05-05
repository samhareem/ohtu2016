package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja {

    private static final Scanner scanner = new Scanner(System.in);

    public void pelaa() {
        Tuomari tuomari = new Tuomari();



        while (true) {
            if (!vuoro(tuomari)) { break; }
        }

        System.out.println("\nKiitos!");
        System.out.println(tuomari);
    }

    private static boolean vuoro(Tuomari tuomari) {
        System.out.print("Ensimmäisen pelaajan siirto: ");
        String ekanSiirto = scanner.nextLine();

        System.out.print("Toisen pelaajan siirto: ");
        String tokanSiirto = scanner.nextLine();

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