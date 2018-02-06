package servisai;

import aparatai.KavosAparatas;
import produktai.Produktai;

import java.util.ArrayList;

public class KavosServisas {

    public KavosAparatas sukurkAparata() {
        KavosAparatas result = new KavosAparatas();
        return result;
    }

    public void isplaukAparata(KavosAparatas aparatas) {
        aparatas.plauti();
    }

    public ArrayList<KavosAparatas> sukurkNAparatu(int n) {
        ArrayList<KavosAparatas> sarasas = new ArrayList<KavosAparatas>();
        for (int i = 0; i < n; i++) {
            sarasas.add(this.sukurkAparata());
        }
        return sarasas;
    }

    public void isvalykAparatuProduktus(ArrayList<KavosAparatas> sarasas) {
        Produktai isvalytiProduktai = new Produktai(0, 0, 0);
        float isvalytaKava = 0;
        for (int i = 0; i < sarasas.size(); i++) {
            KavosAparatas aparatas = sarasas.get(i);

            isvalytiProduktai.setCukrausKiekis(isvalytiProduktai.getCukrausKiekis() + aparatas.getCukrausKiekis());
            aparatas.setCukrausKiekis(0);


            isvalytiProduktai.setKavosKiekis(isvalytiProduktai.getKavosKiekis() + aparatas.getKavosKiekis());
            aparatas.setKavosKiekis(0);

            isvalytiProduktai.setVandensKiekis(isvalytiProduktai.getVandensKiekis() + aparatas.getVandensKiekis());
            aparatas.setVandensKiekis(0);
        }
        System.out.println("Isvalem: "+isvalytiProduktai);
    }

    public void isplaukVisus(ArrayList<KavosAparatas> sarasas) {
        for (int i = 0; i < sarasas.size(); i++) {
            KavosAparatas aparatas = sarasas.get(i);
            isplaukAparata(aparatas);
        }
    }

    public void priskirkBendra(ArrayList<KavosAparatas> sarasas) {
        Produktai bendras = new Produktai(0, 0, 0);
        for (int i = 0; i < sarasas.size(); i++) {
            KavosAparatas aparatas = sarasas.get(i);
            aparatas.setProduktai(bendras);
        }
    }

    public void priskirkSkirtinga(ArrayList<KavosAparatas> sarasas) {

        for (int i = 0; i < sarasas.size(); i++) {
            Produktai skirtingas = new Produktai(0, 0, 0);
            KavosAparatas aparatas = sarasas.get(i);
            aparatas.setProduktai(skirtingas);
        }
    }
}
