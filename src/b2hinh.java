import java.util.Scanner;

public class b2hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("1. hinh chu nhat");
            System.out.println("2. tamgiac");
            System.out.println("3. tamgiacdeu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    hinhchunhat();
                    break;
                case 2:
                    tamgiac();
                    break;
                case 3:
                    tamgiacdeu1();
                    break;
                case 0:
                    tamgiacdeu();
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
            }
        } while (choice != 4);
        scanner.close();
    }

    public static void hinhchunhat() {
        int width = 6;
        int height = 3;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamgiac() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void tamgiacdeu1() {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void tamgiacdeu() {
        for (int i = 1; i <= 5; i++) {
            for (int x = 5; x >= i; x--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" x  ");
            }
            System.out.println();
        }
    }
}


