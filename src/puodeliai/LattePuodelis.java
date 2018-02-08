package puodeliai;

import produktai.Produktai;

public class LattePuodelis extends KavosPuodelis {

    public LattePuodelis(){
        super.setPavadinimas(KavosPuodelis.KAVA_LATTE);
        super.setMaxTalpa(200);
        super.setProduktai(new Produktai(10,20,170));
    }
}
