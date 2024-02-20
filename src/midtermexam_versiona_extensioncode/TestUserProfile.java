/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author gurpa
 */
import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to UserProfile Creator!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Choose your favorite genre:");
        System.out.println("1. Action");
        System.out.println("2. Adventure");
        System.out.println("3. Comedy");
        System.out.println("4. Drama");
        System.out.println("5. Sci-Fi");
        System.out.print("Enter the number corresponding to your favorite genre: ");
        int choice = scanner.nextInt();

        String favoriteGenre;
        switch (choice) {
            case 1:
                favoriteGenre = "Action";
                break;
            case 2:
                favoriteGenre = "Adventure";
                break;
            case 3:
                favoriteGenre = "Comedy";
                break;
            case 4:
                favoriteGenre = "Drama";
                break;
            case 5:
                favoriteGenre = "Sci-Fi";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Action.");
                favoriteGenre = "Action";
        }

        UserProfile userProfile = new UserProfile(name, favoriteGenre);
        System.out.println("UserProfile created successfully!");
        System.out.println(userProfile);
    }
}

class UserProfile {
    private String name;
    private String favoriteGenre;

    public UserProfile(String name, String favoriteGenre) {
        this.name = name;
        this.favoriteGenre = favoriteGenre;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nFavorite Genre: " + favoriteGenre;
    }
}
