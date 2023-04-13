package TUGAS1_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static void MenuAdmin(){
        System.out.println("======== MENU ADMIN ========");
        System.out.println("| 1. Lihat Restaurant       ");
        System.out.println("| 2. Tambah Restaurant      ");
        System.out.println("| 3. Tambah Menu            ");
        System.out.println("| 4. Hapus Restauran        ");
        System.out.println("| 5. Login Ulang            ");
        System.out.println("============================");
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

    public static void removeRestaurant(){
        System.out.print("Masukan nomor id restaurant : ");
        int idRestaurant = scanner.nextInt();

        if(idRestaurant > 0 && idRestaurant <= restaurants.size()){
            restaurants.remove(idRestaurant-1);
            System.out.println("Restaurant terhapus!");
        }else{
            System.out.println("Id restaurant tidak ditemukan!");
        }
    }
}
