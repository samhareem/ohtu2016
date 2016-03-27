package ohtu.verkkokauppa;

/**
 * Created by sami on 26.3.2016.
 */
public interface VarastoInterface {
    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}
