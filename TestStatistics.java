package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {

        // Step 1: Create an array of 10 test scores
        int[] scores = {88, 92, 76, 81, 95, 67, 85, 90, 78, 84};

        // Step 2: Initialize variables to hold the sum, high score, and low score
        int sum = 0;
        int high = scores[0];  // Start with the first score as the highest
        int low = scores[0];   // Start with the first score as the lowest

        // Step 3: Loop through each score in the array
        for (int score : scores) {
            sum += score; // Add each score to the total sum

            // If the score is higher than the current high, update high
            if (score > high) high = score;

            // If the score is lower than the current low, update low
            if (score < low) low = score;
        }

        // Step 4: Calculate the average by dividing the total sum by the number of scores
        double average = (double) sum / scores.length;

        // Step 5: Sort the array so we can find the median
        Arrays.sort(scores);  // This puts the scores in order from smallest to largest

        double median;  // This variable will hold the median value

        // Step 6: If the number of scores is even, average the middle two numbers
        if (scores.length % 2 == 0) {
            median = (scores[scores.length / 2 - 1] + scores[scores.length / 2]) / 2.0;
        } else {
            // If the number is odd, just take the middle value
            median = scores[scores.length / 2];
        }

        // Step 7: Print everything out
        System.out.println("Test Scores: " + Arrays.toString(scores)); // Print all the scores
        System.out.println("Average: " + average);                      // Print the average score
        System.out.println("High Score: " + high);                      // Print the highest score
        System.out.println("Low Score: " + low);                        // Print the lowest score
        System.out.println("Median: " + median);                        // Print the median score

        // Step 8 (BONUS): Show the difference between average and median
        System.out.println("Difference between Average and Median: " + Math.abs(average - median));
    }
}
