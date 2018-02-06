package com.company;

import java.util.Scanner;

public class Main {
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

    public static void main(String[] args) {
    /* Sukurti kavos aparatą:
    * Kuris turėtų atributus:
	* Cukraus kiekis
	* Kavos pupelių kiekis
	* Vandens kiekis
	* Panaudojimų skaičius
	* Panaudojimų skaičiaus riba – konstanta, kuri saugo, kas kiek panaudojimų reikia atlikti plovimą
	* Kuris mokėtų:
	*   Papildyti vandens/pupelių/cukraus
	*   Gaminti bent trijų rūšių kavą (nustatoma pagal String parametrą ir kuri naudotų skirtingus produktų kiekius),
	*       jeigu trūksta nors vieno produkto 0 atspausdintų atitinkamą pranešimą;
	*       Taip pat atspausditų pranešimą jeigu laikas plovimui
	*   Atlikti plovimą (apnulina panaudojimų skaičių)
	*   Pasakyti ar pasiruošęs (netrūksta produktų ir išsivalęs)
	*   Pasakytų kokia dabar produktų būsena – atspausdintų informaciją
	*   Pasakytų kokia yra aparato būsena (kiek liko produktų ir iki plovimo)
	*   Turėtų keletą konstruktorių
	*   Turėtų set ir get metodus laukams
	*/
        Main obj = new Main();
        obj.run();

    }

    private void rodykMeniu() {
        System.out.println("==================================================");
        System.out.println(ACTION_1 + " - Padaryk Juoda kava");
        System.out.println(ACTION_2 + " - Padaryk Latte");
        System.out.println(ACTION_3 + " - Padaryk Espresso");
        System.out.println(ACTION_4 + " - Plauk aparata");
        System.out.println(ACTION_5 + " - Papildyk vandeni");
        System.out.println(ACTION_6 + " - Papildyk cukru");
        System.out.println(ACTION_7 + " - Papildyk kava");
        System.out.println(ACTION_8 + " - Parodyk ar pasiruoses");
        System.out.println(ACTION_9 + " - Parodyk produktu busena");
        System.out.println(ACTION_10 + " - Parodyk aparato busena");
        System.out.println(ACTION_0 + " - Baigti darba");
        System.out.println("==================================================");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        KavosAparatas objektas = new KavosAparatas();
        while (arTesti) {
            rodykMeniu();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {
                case ACTION_0:
                    arTesti = false;
                    break;
                case ACTION_1:
                    objektas.gaminkKava(KavosAparatas.KAVA_JUODA);
                    break;
                case ACTION_2:
                    objektas.gaminkKava(KavosAparatas.KAVA_LATTE);
                    break;
                case ACTION_3:
                    objektas.gaminkKava(KavosAparatas.KAVA_ESPRESSO);
                    break;
                case ACTION_4:
                    objektas.plauti();
                    break;
                case ACTION_5:
                    objektas.papildykVandeni();
                    break;
                case ACTION_6:
                    objektas.papildykCukru();
                    break;
                case ACTION_7:
                    objektas.papildykKava();
                    break;
                case ACTION_8:
                    break;
                case ACTION_9:
                    objektas.parodykProduktuBusena();
                    break;
                case ACTION_10:
                    objektas.parodykAparatoBusena();
                    break;
            }
        }

    }
}
