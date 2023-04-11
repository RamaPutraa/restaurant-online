package TUGAS1_PBO;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) throws Exception {
//        deklarasi
        String user, password;
        int check = 2;
        int menu_resto;
//        new object
        Scanner scanner = new Scanner(System.in);
        Login user1 = new Login();
        RestaurantCRUD restaurant = new RestaurantCRUD();

        do {
            System.out.println("=========== Login ==========");
            System.out.print("| masukan username : ");user = scanner.nextLine();
            System.out.print("| masukan password : ");password = scanner.nextLine();
            System.out.println("============================");


            if (user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
                check = 0;
                int ulang;
                if (user.equals(user1.getUsername_user())) {
                    System.out.println("halo user");
                } else if (user.equals(user1.getUsername_admin())) {
                    do {
                        restaurant.MenuRestaurant();
                        System.out.print("Masukan opsi yang anda inginkan ? : ");
                        menu_resto = scanner.nextInt();

                        switch (menu_resto) {
                            case 1:
                                restaurant.viewRestaurant();
                                break;
                            case 2:
                                restaurant.addRestaurant();
                                break;
                        }

                        System.out.print("Apakah anda ingin memilih menu lain? (1 = iya /2 = tidak) : ");ulang=scanner.nextInt();
                    }while(ulang == 1);
                }
            }else{
                System.out.println("* Username/Password salah!*");
            }

        }while (check > 1);
    }
}
