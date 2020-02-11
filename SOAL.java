package SOAL;

import java.util.ArrayList;
import java.util.Scanner;

public class SOAL {

    public static void main(String[] args) {
        ArrayList<String> kopi = new ArrayList<String>();
        ArrayList<String> Topping = new ArrayList<>();
        ArrayList<String> Asal = new ArrayList<>();

        kls2 robusta = new kls2();
        robusta.setJenisKopi(" kopi Robusta");
        robusta.setAsal("Eropa");
        kopi.add(robusta.getJenisKopi());
        Asal.add(robusta.getAsal());

        kls2 florest = new kls2();
        florest.setJenisKopi(" kopi Florest");
        florest.setAsal("Asia");
        kopi.add(florest.getJenisKopi());
        Asal.add(florest.getAsal());

        kls2 arabica = new kls2();
        arabica.setJenisKopi(" kopi Arabica");
        arabica.setAsal("Timur Tengah");
        kopi.add(arabica.getJenisKopi());
        Asal.add(arabica.getAsal());

        kls3 heny = new  kls3();
        heny.setTopping("Topping Cream");
        Topping.add(heny.getTopping());
        heny.setTopping("Topping gula");
        Topping.add(heny.getTopping());

        System.out.println("Menu kopi :");
        for (int i = 0; i < kopi.size(); i++) {
            int j = i + 1;
            System.out.println(" " + j + " " + kopi.get(i) + " " + Asal.get(i));
        }
        System.out.println("Menu Topping :");
        for (int i = 0; i < Topping.size(); i++) {
            int j = i + 1;
            System.out.println(" " + j + " " + Topping.get(i));
        }
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Masukan pesanan anda ");
            int pilihanKopi = keyboard.nextInt() - 1;
            int pilihantopping = keyboard.nextInt() - 1;

            System.out.println("Pesanan anda kopi " + kopi.get(pilihanKopi) + " berasal dari " + Asal.get(pilihanKopi) + " dengan topping " + Topping.get(pilihantopping));
        } catch (Exception e) {
            System.out.println("Pesanan anda tidak ditemukan");
            System.out.println(e +"\n");
    }
}
}
