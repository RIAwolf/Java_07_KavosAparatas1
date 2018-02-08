package puodeliai;

import produktai.Produktai;

public class EsspressoPuodelis extends KavosPuodelis {

    public EsspressoPuodelis(){
        super.setPavadinimas(KavosPuodelis.KAVA_ESPRESSO);
        super.setMaxTalpa(100);
        super.setProduktai(new Produktai(10,40,50));
    }
}
