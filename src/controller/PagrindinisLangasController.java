package controller;

import aparatai.KavosAparatas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import servisai.KavosServisas;

import java.util.ArrayList;

public class PagrindinisLangasController {
    private KavosServisas servisas;


    private ArrayList<KavosAparatas> aparatuSarasas;

    public TextField aparatuKiekioIvedimoLaukas;
    public Label sukurtuAparatuLabel;
    public Label produktoBusena;

    public Button priskirkBendra;
    public Button priskirkSkirtingus;


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
            produktoBusena.setText("Nėra");

            priskirkBendra.setDisable(false);
            priskirkSkirtingus.setDisable(false);

        } catch (Exception e) {
            System.out.println("Ivesta ne skaicius");
        }
    }

    public void onPriskirkSkirtingus(){}
    public void onPriskirkBendra(){}
}
