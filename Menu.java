package TUGAS1_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private static Scanner scanner = new Scanner(System.in);

    private int id_restaurant,harga_makanan,harga_minuman;
    private String makanan,minuman;
    public Menu(int id_restaurant, int harga_makanan, int harga_minuman, String makanan, String minuman){
        this.id_restaurant = id_restaurant;
        this.makanan = makanan;
        this.minuman = minuman;
        this.harga_makanan = harga_makanan;
        this.harga_minuman = harga_minuman;
    }

    public static Scanner getScanner() {
        return scanner;
    }

    public static void setScanner(Scanner scanner) {
        Menu.scanner = scanner;
    }

    public int getId_restaurant() {
        return id_restaurant;
    }

    public void setId_restaurant(int id_restaurant) {
        this.id_restaurant = id_restaurant;
    }

    public int getHarga_makanan() {
        return harga_makanan;
    }

    public void setHarga_makanan(int harga_makanan) {
        this.harga_makanan = harga_makanan;
    }

    public int getHarga_minuman() {
        return harga_minuman;
    }

    public void setHarga_minuman(int harga_minuman) {
        this.harga_minuman = harga_minuman;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getMinuman() {
        return minuman;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }
}
