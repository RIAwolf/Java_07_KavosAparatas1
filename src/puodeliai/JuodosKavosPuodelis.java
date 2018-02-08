package puodeliai;

import produktai.Produktai;

public class JuodosKavosPuodelis extends KavosPuodelis {

    public JuodosKavosPuodelis(){
        super.setPavadinimas(KavosPuodelis.KAVA_JUODA);
        super.setMaxTalpa(200);
        super.setProduktai(new Produktai(10,20,170));
    }
}
