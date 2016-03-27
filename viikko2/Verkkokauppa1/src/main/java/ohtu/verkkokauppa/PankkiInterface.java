package ohtu.verkkokauppa;

/**
 * Created by sami on 26.3.2016.
 */
public interface PankkiInterface {
    boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
