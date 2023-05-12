package com.collections;

/**
 * creating login page for using hash map
 * @author Madhumitha 
 * date : 10/05/2023
 */
import java.util.*;
public class LoginUser {
	public static void userAuthentication(HashMap<String, String> fm,HashMap<String, String> pm) {
		Scanner scan = new Scanner(System.in);
        System.out.print("Login: ");
        String username = scan.nextLine();
        System.out.print("Password: ");
        String password = scan.nextLine();
        int attempts = 1;
        while (attempts <= 3) {
            // Check if the username exists
            if (pm.containsKey(username)) {
                // Check if the password is correct
                if (pm.get(username).equals(password)) {
                    // Login successful
                    System.out.println("Login Successful");
                    System.out.println("Welcome " + fm.get(username) + ".");
                    break;
                } else {
                    // Incorrect password and its attempts
                    System.out.println("Incorrect password. " + (3 - attempts) + " attempts remaining.");
                    attempts++;
                    System.out.print("Password: ");
                    password = scan.nextLine();
                }
            } else {
                // username not found 
                System.out.println("Invalid username. " + (3 - attempts) + " attempts remaining.");
                attempts++;
                // Prompt the user to enter login name and password again
                System.out.print("Login: ");
                username = scan.nextLine();
                System.out.print("Password: ");
                password = scan.nextLine();
            }
        }
        if (attempts > 3) {
            // Login failed after three attempts
            System.out.println("Login failed. Too many attempts.");
        }
        scan.close();
	}
	public static void main(String[] args) {
        
        //hash map containing username and full name
		HashMap<String, String> fm = new HashMap<>();
        fm.put("icrane", "Ichabod Crane");
        fm.put("bbones", "Brom Bones");
        fm.put("epokeman", "Emboar Pokeman");
        fm.put("rpokemon", "Rayquazza Pokeman");
        fm.put("cdude", "Cool Dude");

        //hash map containing username and password
        HashMap<String, String> pm = new HashMap<>();
        pm.put("icrane", "Qwerty123");
        pm.put("bbones", "Pass456!");
        pm.put("epokeman", "Password123");
        pm.put("rpokemon", "Drow456");
        pm.put("cdude", "Dh456!32");
        
        //creating 3 attempts method
        userAuthentication(fm,pm);
    }
}
