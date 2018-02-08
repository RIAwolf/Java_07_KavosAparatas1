package puodeliai;

import produktai.Produktai;

public class KavosPuodelis extends Puodelis{
    public static final String KAVA_JUODA = "Juoda";
    public static final String KAVA_LATTE = "Latte";
    public static final String KAVA_ESPRESSO = "Espresso";
    private Produktai produktai;
    private boolean arPagaminta;
    private String pavadinimas;

    @Override
    public String toString() {
        return "Pavadinimas "+pavadinimas+" ar pagaminta "+arPagaminta+" "+ super.toString()+ " Produktai:"+produktai.toString();
    }

    public boolean getArPagaminta( ) {
        return this.arPagaminta;
    }
    public void setArPagaminta(boolean arPagaminta) {
        this.arPagaminta = arPagaminta;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }
    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setProduktai(Produktai produktai) {
        this.produktai = produktai;
    }

    public Produktai getProduktai() {
        return this.produktai;
    }
}
