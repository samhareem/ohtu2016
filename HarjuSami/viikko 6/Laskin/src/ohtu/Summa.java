package ohtu;

import javax.swing.*;

/**
 * Created by sami on 21.4.2016.
 */
public class Summa implements Komento {
    private Sovelluslogiikka sovellus;
    private JTextField tulos;
    private JTextField syote;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovellus = sovellus;
        tulos = tuloskentta;
        syote = syotekentta;
    }

    @Override
    public void suorita() {
        sovellus.plus(Integer.parseInt(syote.getText()));
    }
}
