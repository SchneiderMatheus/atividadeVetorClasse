package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Rent #"+(i+1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room you want: ");
            int quartos = sc.nextInt();
            Room rooms = new Room(quartos, name, email);
        }



        sc.close();
    }
}
