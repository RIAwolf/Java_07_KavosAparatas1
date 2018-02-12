package controller;

import aparatai.KavosAparatas;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import produktai.Produktai;
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

    public Label parinktasAparatas;
    public TextField aparatoNumeris;
    public Button rinkisAparata;
    private int _aparatas;


    // produkto salinimo dalis
    private boolean _yraAparatu = false;
    private boolean _priskirtaProduktu = false;
    public Button salintiProduktus;
    public Label salinimasK;
    public Label salinimasV;
    public Label salinimasC;

    public Button pildykCukru;
    public Button pildykVandeni;
    public Button pildykKava;

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
            _yraAparatu = true;
            priskirkBendra.setDisable(false);
            priskirkSkirtingus.setDisable(false);
            rinkisAparata.setDisable(false);
            salintiProduktus.setDisable(!arAttrakintiSalinima());

        } catch (Exception e) {
            System.out.println("Ivesta ne skaicius");
        }
    }

    public void onPriskirkSkirtingus() {
        servisas.priskirkSkirtinga(aparatuSarasas);
        produktoBusena.setText("Skirtingi");
        _priskirtaProduktu = true;
        atrakintiPildyma();
        salintiProduktus.setDisable(!arAttrakintiSalinima());
    }

    public void onPriskirkBendra() {
        servisas.priskirkBendra(aparatuSarasas);
        produktoBusena.setText("Bendras");
        _priskirtaProduktu = true;
        atrakintiPildyma();
        salintiProduktus.setDisable(!arAttrakintiSalinima());
    }

    public void onRinkisAparata() {
        String ivestaLaukelyje = aparatoNumeris.getText();
        try {
            int n = Integer.parseInt(ivestaLaukelyje);
            _aparatas = n;
            atrakintiPildyma();
            parinktasAparatas.setText("" + _aparatas);
        } catch (Exception e) {
            System.out.println("Ivesta ne skaicius");
        }
    }

    private boolean arAttrakintiSalinima() {
        if (_yraAparatu == true && _priskirtaProduktu == true) {
            return true;
        }
        return false;
    }

    public void onSalintiProduktus() {
        Produktai produktai = servisas.isvalykAparatuProduktus(aparatuSarasas);
        salinimasC.setText("" + produktai.getCukrausKiekis());
        salinimasV.setText("" + produktai.getVandensKiekis());
        salinimasK.setText("" + produktai.getKavosKiekis());
    }

    private void parodykAparatoInfo() {
        salinimasC.setText("" + aparatuSarasas.get(_aparatas).getCukrausKiekis());
        salinimasV.setText("" + aparatuSarasas.get(_aparatas).getVandensKiekis());
        salinimasK.setText("" + aparatuSarasas.get(_aparatas).getKavosKiekis());

    }

    private void atrakintiPildyma(){
        if (!_priskirtaProduktu || _aparatas < 0) {
            return;
        }
        pildykCukru.setDisable(false);
        pildykVandeni.setDisable(false);
        pildykKava.setDisable(false);

    }

    public void onPildykCukru() {

        aparatuSarasas.get(_aparatas).papildykCukru();
        parodykAparatoInfo();


    }

    public void onPildykVandeni() {

        aparatuSarasas.get(_aparatas).papildykVandeni();
        parodykAparatoInfo();
    }

    public void onPildykKava() {

        aparatuSarasas.get(_aparatas).papildykKava();
        parodykAparatoInfo();
    }
}
