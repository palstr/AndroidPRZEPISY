package com.example.mobilnethepowrot;

import java.util.ArrayList;

public class Repozytorium {
    public static final Przepis[] wszystkiePrzepisy = new Przepis[]{
        new Przepis("sernik",
                "ciasta",
                R.drawable.sernik,
                70,
                new String[]{"ser", "ziemniaki", "masło"},
                "wszystko zmieszać, piec godzinę"),

                new Przepis("muffinka",
                        "ciastka",
                        R.drawable.muffin,
                        30,
                        new String[]{"mąka", "kakao", "mleko", "masło"},
                        "wszystko zmieszać i upiec"),

            new Przepis("chleb",
                        "pieczywo",
                        R.drawable.chleb,
                        80,
                        new String[]{"ziarna", "mąka", "jajka"},
                        "zmieszać i upiec"),

            new Przepis("krówka",
                        "ciasta",
                        R.drawable.krowka,
                        60,
                        new String[]{"mleko", "karmel", "biszkopt"},
                        "zrobić warstwy i upiec")

    };

    public static ArrayList<Przepis> przepisyZKategorii(String kategoria){
        ArrayList<Przepis> przepisy = new ArrayList<>();
        for (Przepis przepis:
             wszystkiePrzepisy) {
            if(przepis.getKategoria().equals(kategoria)){
                przepisy.add(przepis);
            }
        }

        return przepisy;
    }



}
