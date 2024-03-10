import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        int N = scanner.nextInt();
        int[] floorSizes = new int[N];

        // Input the sizes of floors
        for (int i = 0; i < N; i++) {
            System.out.println("enter the floor size given on day : " + (i + 1));
            floorSizes[i] = scanner.nextInt();
        }

        SkyscraperConstructor constructor = new SkyscraperConstructor();
        constructor.constructSkyscraper(N, floorSizes);
    }
}