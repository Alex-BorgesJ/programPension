package application;

import java.util.Scanner;
import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rent[] vetRooms = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int numRooms = sc.nextInt();

		for (int i = 1; i <= numRooms; i++) {

			System.out.println();
			System.out.printf("Rernt #%d:%n", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();

			vetRooms[room] = new Rent(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		
		for (int i = 0; i < 10; i++) {

			if (vetRooms[i] != null) {

				System.out.println(i + ": " + vetRooms[i]);

			}

		}
		sc.close();
	}

}
