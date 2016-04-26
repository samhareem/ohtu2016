package ohtu;

import javax.swing.*;

/**
 * Created by sami on 22.4.2016.
 */
class Nollaa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;

    public Nollaa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        tulos = tuloskentta;
        syote = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
    }
 }
