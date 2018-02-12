package controller;

import aparatai.KavosAparatas;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import servisai.KavosServisas;

import java.util.ArrayList;

public class PagrindinisLangasController {
    private KavosServisas servisas;


    private ArrayList<KavosAparatas> aparatuSarasas;

    public TextField aparatuKiekioIvedimoLaukas;
    public Label sukurtuAparatuLabel;


    public PagrindinisLangasController() {
        servisas = new KavosServisas();
    }



    public void onSukurkNAparatu() {
        String ivestaLaukelyje = aparatuKiekioIvedimoLaukas.getText();
        try {
            int n = Integer.parseInt(ivestaLaukelyje);
            aparatuSarasas = servisas.sukurkNAparatu(n);
            System.out.println("Prikuriau: " + n + " aparatu");
            sukurtuAparatuLabel.setText("" + aparatuSarasas.size());
        } catch (Exception e) {
            System.out.println("Ivesta ne skaicius");
        }
    }
}
