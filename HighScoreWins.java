package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        // Ask the user to enter the game score in the correct format
        System.out.print("Please enter a game score: ");

        // Read the full line of input the user types in (e.g., "Home:Visitor|21:9")
        String input = scanner.nextLine();

        // Split the input into two parts: team names and scores
        // The '|' symbol separates the two sections
        // Example: "Home:Visitor|21:9" becomes ["Home:Visitor", "21:9"]
        String[] parts = input.split("\\|");

        // Now split the first part ("Home:Visitor") by colon to get individual team names
        String[] teams = parts[0].split(":");
        // Now split the second part ("21:9") by colon to get the scores
        String[] scores = parts[1].split(":");

        // Store the team names in variables for easy use
        String team1 = teams[0]; // First team (e.g., Home)
        String team2 = teams[1]; // Second team (e.g., Visitor)

        // Convert the score strings to integers so we can compare them
        int score1 = Integer.parseInt(scores[0]); // First team's score
        int score2 = Integer.parseInt(scores[1]); // Second team's score

        // Now compare the scores to find the winner
        if (score1 > score2) {
            // If the first team has a higher score, they are the winner
            System.out.println("Winner: " + team1);
        } else if (score2 > score1) {
            // If the second team has a higher score, they are the winner
            System.out.println("Winner: " + team2);
        } else {
            // If both scores are equal, it's a tie
            System.out.println("It's a tie!");
        }

        // Close the scanner to free up system resources
        scanner.close();
    }
}
