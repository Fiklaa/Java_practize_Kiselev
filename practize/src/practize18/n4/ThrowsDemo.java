package practize18.n4;

import java.util.Scanner;

public class ThrowsDemo {

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        while (true) {
            try {
               System.out.print("Enter key: ");
                key = myScanner.nextLine();

                printDetails(key);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) {
        if (key.isEmpty()) {
            throw new RuntimeException("Key set to empty string");
        }
        return "key - " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}
