package TUGAS1_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantCRUD {
    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Restaurant> restaurants = new ArrayList<>();

    static void MenuRestaurant(){
        System.out.println("======== MENU RESTAURANT ========");
        System.out.println("| 1. Lihat Restaurant            ");
        System.out.println("| 2. Tambah Restaurant           ");
        System.out.println("| 3. Hapus Restauran             ");
        System.out.println("=================================");
    }
    public void addRestaurant(){
        System.out.println("Masukan Id Restaurant : ");
        int id = scanner.nextInt();

        System.out.println("Masukan Nama Restaurant : ");
        String nama = scanner.nextLine();

        System.out.println("Masukan Alamat Restaurant : ");
        String alamat = scanner.nextLine();

        Restaurant restaurant = new Restaurant(id,nama,alamat);
        restaurants.add(restaurant);
    }
}
