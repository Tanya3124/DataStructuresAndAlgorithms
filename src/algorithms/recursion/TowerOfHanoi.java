package algorithms.recursion;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many disks do you have?: ");
        int numberOfDisks = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter three characters for the towers: ");
        char firstTower = scanner.nextLine().trim().charAt(0);
        char secondTower = scanner.nextLine().trim().charAt(0);
        char thirdTower = scanner.nextLine().trim().charAt(0);
        scanner.close();
        System.out.println("Do this to solve the Tower of Hanoi: ");
        showSteps(numberOfDisks, firstTower, secondTower, thirdTower);
    }

    private static void showSteps(int numberOfDisks, char source, char via, char destination) {
    }
}
