import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
    public static ArrayList<Menu> menus = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);
    static void MenuAdmin(){
        System.out.println("======== MENU ADMIN ========");
        System.out.println("| 1. Lihat Restaurant       ");
        System.out.println("| 2. Tambah Restaurant      ");
        System.out.println("| 3. Hapus Restauran        ");
        System.out.println("| 4. Login Ulang            ");
        System.out.println("============================");
    }

    //    add restaurant
    public static void addRestaurant() {
        System.out.print("Masukan Id Restaurant : ");
        int id = scanner.nextInt();

        System.out.print("Masukan Nama Restaurant : ");
        String nama = scanner.next();

        System.out.print("Masukan Alamat Restaurant : ");
        String alamat = scanner.next();
        Restaurant restaurant = new Restaurant(id, nama, alamat);
        restaurants.add(restaurant);

        int ulang;
        do {
            System.out.println("========================================");
            System.out.print("Restoran ");
            System.out.println(restaurant.getNama());

            System.out.println("Tambahkan menu ");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.print("Pilih opsi : ");
            int input = scanner.nextInt();
            System.out.print("Masukan nama menu : ");
            String nama_menu = scanner.next();
            System.out.print("Masukan harga menu : ");
            double harga_menu = scanner.nextDouble();

            Menu menu  = new Menu(id,nama_menu,harga_menu);
            switch (input) {
                case 1:
                    menus.add(menu);
                    break;
                case 2:
                    menus.add(menu);
                    break;
            }
            System.out.print("ingin menambah menu lagi? (i = iya / 2 = tidak) : ");
            ulang = scanner.nextInt();
        } while (ulang == 1);


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

    public static void viewMenu(){
        viewRestaurant();
        System.out.print("Masukan restorant yang diinginkan : ");int pilih = scanner.nextInt();
        if(restaurants.size() > 0) {
            for(int a = 0; a <restaurants.size(); a++) {
                int res=restaurants.get(a).getId();
                if (menus.size() > 0) {
                    for (int i = 0; i < menus.size(); i++) {
                        int men = menus.get(i).getId();
                        if (pilih == res && res == men){
                            System.out.println(i + 1 + ". " + menus.get(i).toString());
                        }
                    }
                } else {
                    System.out.println("Menu restaurant belum ada!");
                }
            }
        }else{
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
