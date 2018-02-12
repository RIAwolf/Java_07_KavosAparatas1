package com.company;

import aparatai.KavosAparatas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import puodeliai.KavosPuodelis;
import puodeliai.LattePuodelis;
import servisai.KavosServisas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Application {
    public static final int ACTION_0 = 0;
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;
    public static final int ACTION_4 = 4;
    public static final int ACTION_5 = 5;
    public static final int ACTION_6 = 6;
    public static final int ACTION_7 = 7;
    public static final int ACTION_8 = 8;
    public static final int ACTION_9 = 9;
    public static final int ACTION_10 = 10;

    public static final int SERVICE_ACTION_1 = 11;
    public static final int SERVICE_ACTION_2 = 12;
    public static final int SERVICE_ACTION_3 = 13;
    public static final int SERVICE_ACTION_4 = 14;
    public static final int SERVICE_ACTION_5 = 15;
    public static final int SERVICE_ACTION_6 = 16;
    public static final int SERVICE_ACTION_7 = 17;
    public static final int SERVICE_ACTION_8 = 18;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../../view/PagrindinisLangas.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 640, 480));
        primaryStage.show();
    }

    public static void main(String[] args) {


    launch(args);

    }

    private void rodykMeniu() {
        // Papildyti vieno aparato produktus ir
        // parodyti laukeliuose kiek ju yra




    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        KavosServisas servisas = new KavosServisas();
        int kurisAparatas = -1;
        int aparatuKiekis = -1;
        ArrayList<KavosAparatas> sarasas = null;
        while (arTesti) {
            rodykMeniu();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case SERVICE_ACTION_1:
                    System.out.println("Iveskite aparatu kieki");
                    aparatuKiekis = sc.nextInt();
                    sarasas = servisas.sukurkNAparatu(aparatuKiekis);
                    break;
                case SERVICE_ACTION_2:
                    System.out.println("Iveskite aparato eiles numeri, prasideda nuo 0");
                    kurisAparatas = sc.nextInt();
                    break;
                case SERVICE_ACTION_3:
                    servisas.isplaukVisus(sarasas);
                    break;
                case SERVICE_ACTION_4:
                    servisas.isvalykAparatuProduktus(sarasas);
                    break;
                case SERVICE_ACTION_5:
                    servisas.priskirkBendra(sarasas);
                    break;
                case SERVICE_ACTION_6:
                    servisas.priskirkSkirtinga(sarasas);
                    break;
                case SERVICE_ACTION_7:
                    sarasas = servisas.nuskaitykKavosAparatus();
                    break;
                case SERVICE_ACTION_8:
                    servisas.issaugokAparatus(sarasas);
                    break;
                case ACTION_0:
                    arTesti = false;
                    break;
                case ACTION_1:
                    sarasas.get(kurisAparatas).gaminkKava(KavosPuodelis.KAVA_JUODA);
                    break;
                case ACTION_2:
                    sarasas.get(kurisAparatas).gaminkKava(KavosPuodelis.KAVA_LATTE);
                    break;
                case ACTION_3:
                    sarasas.get(kurisAparatas).gaminkKava(KavosPuodelis.KAVA_ESPRESSO);
                    break;
                case ACTION_4:
                    sarasas.get(kurisAparatas).plauti();
                    break;
                case ACTION_5:
                    sarasas.get(kurisAparatas).papildykVandeni();
                    break;
                case ACTION_6:
                    sarasas.get(kurisAparatas).papildykCukru();
                    break;
                case ACTION_7:
                    sarasas.get(kurisAparatas).papildykKava();
                    break;
                case ACTION_8:
                    break;
                case ACTION_9:
                    sarasas.get(kurisAparatas).parodykProduktuBusena();
                    break;
                case ACTION_10:
                    sarasas.get(kurisAparatas).parodykAparatoBusena();
                    break;
            }
        }

    }
}
