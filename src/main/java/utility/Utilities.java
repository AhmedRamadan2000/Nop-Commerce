package utility;

import java.util.Random;

public class Utilities {
    public static int generateRandomNumber(int lowerBound, int upperBound) {
        // Create a new instance of the Random class
        Random random = new Random();

        // Generate a random number between lowerBound and upperBound, inclusive
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;

        return randomNumber;
    }
}