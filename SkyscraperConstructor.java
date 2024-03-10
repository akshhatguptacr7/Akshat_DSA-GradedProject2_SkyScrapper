import java.util.*;

class SkyscraperConstructor {
    public void constructSkyscraper(int N, int[] floorSizes) {
        PriorityQueue<Integer> availableFloors = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            System.out.println("Day: " + (i + 1));
            availableFloors.add(floorSizes[i]);
            printConstructedFloors(availableFloors);
        }
    }

    private void printConstructedFloors(PriorityQueue<Integer> availableFloors) {
        PriorityQueue<Integer> tempQueue = new PriorityQueue<>(availableFloors);
        while (!tempQueue.isEmpty()) {
            System.out.print(tempQueue.poll() + " ");
        }
        System.out.println();
    }
}