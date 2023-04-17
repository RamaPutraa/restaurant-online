import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Admin {
//    private static ArrayList<Restaurant> restaurants = new ArrayList<>();
//    public static ArrayList<Menu> menus = new ArrayList<>();
    static  HashMap<String, Restaurant> restaurants = new HashMap<>();
    public static ArrayList<Order> orders = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static void MenuAdmin(){
        System.out.println("======== MENU ADMIN ========");
        System.out.println("| 1. Lihat Restaurant       ");
        System.out.println("| 2. Tambah Restaurant      ");
        System.out.println("| 3. Hapus Restauran        ");
        System.out.println("| 4. Login Ulang            ");
        System.out.println("| 5. Logout                 ");
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

        String inputMenu = "";
        while (!inputMenu.equals("selesai")){
            System.out.print("Masukan menu (format: menuName|menuPrice) enter, lalu ketik \"selesai\" untuk selesai: ");
            inputMenu = scanner.next();
            if(!inputMenu.equals("selesai")){
                String[] menuData = inputMenu.split("\\|");
                restaurant.setMenus(new Menu(menuData[0], Integer.parseInt(menuData[1])));
            }
        }
        restaurants.put(nama,restaurant);
        System.out.println("Tambah restaurant berhasil!");
    }


    //    view retaurant
    public static void viewRestaurant(){
        System.out.println("============= RESTAURANT =============");
        for(String namaRestaurant : restaurants.keySet()){
            System.out.println("ID Restaurant : " + restaurants.get(namaRestaurant).getId()
                    + " || Nama : " + namaRestaurant + " || Alamat : " +restaurants.get(namaRestaurant).getAlamat());
            System.out.println("Menu : ");
            for (Menu menu : restaurants.get(namaRestaurant).getMenus()){
                System.out.println(menu.getNama() + " || " +menu.getHarga());
            }
        }
    }

    public static void viewMenu(){
        System.out.println("==== RESTAURANT ====");
        for(String namarestaurant : restaurants.keySet()) {
            System.out.println(namarestaurant + " || " + restaurants.get(namarestaurant).getAlamat());
        }
        System.out.print("Masukan nama restaurant : ");
        String pilih_restaurant = scanner.next();
        if(!restaurants.containsKey(pilih_restaurant)){
            System.out.println("Menu tidak ada!");
        }
        Restaurant res = restaurants.get(pilih_restaurant);
        Order newOrder = new Order(res);
        String menu = "";
        while(!menu.equals("2")){
            System.out.println("==== "+ res.getNama() + " ====");
            System.out.println("Menu : ");
            int nomorMenu = 1;
            for (Menu menu1 : res.getMenus()){
                System.out.println(nomorMenu + ". " + menu1.getNama() + " - " + menu1.getHarga());
                nomorMenu++;
            }
            System.out.print("Masukan nomor menu : ");
            int indexMenu = scanner.nextInt();
            System.out.print("Jumlah beli : ");
            int jumlah_beli = scanner.nextInt();
            scanner.nextLine();

            newOrder.addMenu(res.getMenus().get(indexMenu - 1), jumlah_beli);

            System.out.print("Tambah menu lagi?  (1 = iya / 2 = tidak) : ");
            menu = scanner.next();
        }
        System.out.print("Masukan jarak pengantaran makanan (dalam km) : ");
        int jarak = scanner.nextInt();

        newOrder.setDistance(jarak);
        orders.add(newOrder);
        System.out.println("Order menu berhasil!");

    }

    public static void removeRestaurant(){
        for(String namaRestaurant : restaurants.keySet()){
            System.out.println("ID Restaurant : " + restaurants.get(namaRestaurant).getId()
                    + " || Nama : " + namaRestaurant + " || Alamat : " +restaurants.get(namaRestaurant).getAlamat());
        }
        System.out.println("==============================");
        System.out.println("Masukan nama restaurant : ");
        String namaRestaurant = scanner.next();
        if(restaurants.containsKey(namaRestaurant)){
            restaurants.remove(namaRestaurant);
            System.out.println("Restaurant berhasil di hapus!");
        }else{
            System.out.println("Restaurant tidak ditemukan!");
        }
    }
}
