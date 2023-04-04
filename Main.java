package package2;

import package2.Login;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main (String [] args) throws Exception {
        String user, password;
        int check = 2;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Login user1 = new Login();
        do {
            System.out.println("=========== Login ==========");
            System.out.print("| masukan username : ");user = br.readLine();
            System.out.print("| masukan password : ");password = br.readLine();
            System.out.println("============================");


            if (user.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || user.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
                check = 0;
                if (user.equals(user1.getUsername_user())) {
                    System.out.println("halo user");
                } else if (user.equals(user1.getUsername_admin())) {
                    System.out.println("halo admin");
                }
            }else{
                System.out.println("* Username/Password salah!*");
            }

        }while (check > 1);
    }
}
