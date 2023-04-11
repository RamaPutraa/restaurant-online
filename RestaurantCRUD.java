package TUGAS1_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantCRUD {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static void MenuRestaurant(){
        System.out.println("======== MENU RESTAURANT ========");
        System.out.println("| 1. Lihat Restaurant            ");
        System.out.println("| 2. Tambah Restaurant           ");
        System.out.println("| 3. Hapus Restauran             ");
        System.out.println("=================================");
    }

//    add restaurant
    public static void addRestaurant(){
        System.out.print("Masukan Id Restaurant : ");
        int id = scanner.nextInt();

        System.out.print("Masukan Nama Restaurant : ");
        String nama = scanner.next();

        System.out.print("Masukan Alamat Restaurant : ");
        String alamat = scanner.next();

        Restaurant restaurant = new Restaurant(id,nama,alamat);
        restaurants.add(restaurant);
    }
//    view retaurant
    public static void viewRestaurant(){
        if(restaurants.size() > 0 ){
            for(int i = 0; i < restaurants.size(); i++){
                System.out.println(i+1 +". "+ restaurants.get(i).toString());
            }
        }else {
            System.out.println("Data restaurant belum ada!");
        }
    }
}
