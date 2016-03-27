package ohtu.verkkokauppa;

import java.util.ArrayList;

/**
 * Created by sami on 26.3.2016.
 */
public interface KirjanpitoInterface {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
