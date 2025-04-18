package com.pluralsight;

public class RollTheDice {
    public static void main(String[] args) {

        // Create a dice object using the Dice class
        // Now we can use dice.roll() to roll the dice and get a number from 1 to 6
        Dice dice = new Dice();

        // These variables will store the two dice rolls each time
        int roll1, roll2;

        // These variables will count how many times certain sums appear
        int twoCounter = 0;   // Number of times the total was 2
        int fourCounter = 0;  // Number of times the total was 4
        int sixCounter = 0;   // Number of times the total was 6
        int sevenCounter = 0; // Number of times the total was 7

        // Now we want to roll the dice 100 times
        // This loop will repeat 100 times, from i = 1 to i = 100
        for (int i = 1; i <= 100; i++) {

            // Roll the first dice and save the result
            roll1 = dice.roll();

            // Roll the second dice and save the result
            roll2 = dice.roll();

            // Add the two rolls together to get the total (sum)
            int sum = roll1 + roll2;

            // Print the result of the roll
            // For example: "Roll 5: 3 - 6  Sum: 9"
            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + "  Sum: " + sum);

            // Check if the sum is one of the numbers we are counting
            // If it is 2, add 1 to the twoCounter
            if (sum == 2) {
                twoCounter++;
            }
            // If it is 4, add 1 to the fourCounter
            else if (sum == 4) {
                fourCounter++;
            }
            // If it is 6, add 1 to the sixCounter
            else if (sum == 6) {
                sixCounter++;
            }
            // If it is 7, add 1 to the sevenCounter
            else if (sum == 7) {
                sevenCounter++;
            }

            // If it's none of those, we just move on without counting it
        }

        // After the loop is done (we've rolled 100 times), show the results

        System.out.println("\nSummary:"); // \n adds a blank line for readability

        // Show how many times each of the special sums occurred
        System.out.println("Number of times 2 was rolled: " + twoCounter);
        System.out.println("Number of times 4 was rolled: " + fourCounter);
        System.out.println("Number of times 6 was rolled: " + sixCounter);
        System.out.println("Number of times 7 was rolled: " + sevenCounter);
    }
}
