import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user, password;
        int menu_resto;
        int menu_order;
//        new object
        Scanner scanner = new Scanner(System.in);
        Login user1 = new Login();
        Admin restaurant = new Admin();
        Admin menu = new Admin();
        boolean loggiedin = false;

        while(loggiedin == false) {
            System.out.println("=========== Login ==========");
            System.out.print("| masukan username : ");user = scanner.next();
            System.out.print("| masukan password : ");password = scanner.next();
            System.out.println("============================");


            if (user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
                int ulang;
                loggiedin = true;
                if (user.equals(user1.getUsername_user())) {
                    do {
                        System.out.println("======== MENU CUSTOMER ========");
                        System.out.println("| 1. Order                     ");
                        System.out.println("| 2. Lihat Orderan             ");
                        System.out.println("| 3. Login Ulang               ");
                        System.out.println("| 4. Logout                    ");
                        System.out.println("===============================");
                        System.out.print("Masukan opsi yang anda inginkan ? ");
                        menu_order = scanner.nextInt();
                        switch (menu_order){
                            case 1:
                                restaurant.viewMenu();
                                break;
                            case 2:

                                break;
                            case 3:
                                loggiedin = false;
                                break;
                            case 4:
                                System.out.println("Anda berhasil logout!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggiedin == false) ? "Login ulang ? (1 = Tidak/ 2 = Iya) : " : "Apakah anda ingin memilih menu lain? (1 = iya /2 = tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                } else if (user.equals(user1.getUsername_admin())) {
                    do {
                        restaurant.MenuAdmin();
                        System.out.print("Masukan opsi yang anda inginkan : ");
                        menu_resto = scanner.nextInt();

                        switch (menu_resto) {
                            case 1:
                                restaurant.viewRestaurant();
                                break;
                            case 2:
                                restaurant.addRestaurant();
                                break;
                            case 3:
                                restaurant.removeRestaurant();
                                break;
                            case 4:
                                loggiedin = false;
                                break;
                            case 5:
                                System.out.println("Anda berhasil logout!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggiedin == false) ? "Login ulang ? (1 = Tidak/ 2 = Iya) : " : "Apakah anda ingin memilih menu lain? (1 = iya /2 = tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                }

            }else{
                System.out.println("* Username/Password salah!*");
            }

        }
    }
}