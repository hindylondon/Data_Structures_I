package week9;

import java.util.*;

public class Menu {

	// method to recursively display the menu
	public static void DisplayMenu(Scanner scanner) {
		// give menu options for user
		System.out.println("Menu:");
		System.out.println("1) Instructions");
		System.out.println("2) Start Game");
		System.out.print("Choose your option: ");

		// set users choice
		int menuOption = scanner.nextInt();

		if (menuOption == 1) {
			System.out.println(
					"Tic Tac Toe is played on a 3x3 grid, with two players taking turns marking cells with their symbols (X or O). "
							+ "\nThe objective is to be the first to get three of your symbols in a row, either horizontally, vertically, or diagonally. "
							+ "\nThe game ends when a player achieves a winning combination or when the entire board is filled, resulting in a draw. "
							+ "\nPlayers can play multiple rounds, enjoying the game to its fullest.");

			// display menu recursively
			DisplayMenu(scanner);
		} else if (menuOption == 2) {
			// start the game
			System.out.println("Starting the game...");
		} else {
			// display error message for invalid option
			System.out.println("Invalid Entry! Please enter either 1 or 2.");
			DisplayMenu(scanner);
		}
	}
}
