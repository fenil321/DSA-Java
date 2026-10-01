import java.util.Scanner;

public class numToWord {

    // Arrays to store words for numbers
    private static final String[] UNITS = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 - 9999): ");
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // Limit checks for the requested range
            if (number < 0 || number > 9999) {
                System.out.println("Error: Please enter a number between 0 and 9999.");
            } else if (number == 0) {
                System.out.println("Output: Zero");
            } else {
                System.out.println("Output: " + convertToWords(number));
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        scanner.close();
    }

    // Helper method to convert numbers up to 9999 into words
    private static String convertToWords(int number) {
        if (number < 20) {
            return UNITS[number];
        }

        if (number < 100) {
            return TENS[number / 10] + ((number % 10 != 0) ? " " + UNITS[number % 10] : "");
        }

        if (number < 1000) {
            return UNITS[number / 100] + " Hundred" + ((number % 100 != 0) ? " " + convertToWords(number % 100) : "");
        }

        // Handles numbers from 1000 to 9999
        return UNITS[number / 1000] + " Thousand" + ((number % 1000 != 0) ? " " + convertToWords(number % 1000) : "");
    }
}