package python.tape;
import java.util.*;

public class tape {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of files: ");
        int n = sc.nextInt();

        int[] files = new int[n];

        System.out.println("Enter file lengths:");
        for (int i = 0; i < n; i++) {
            files[i] = sc.nextInt();
        }

        // Sort files in ascending order
        Arrays.sort(files);

        int totalRetrievalTime = 0;
        int currentTime = 0;

        System.out.println("\nOptimal order:");

        for (int i = 0; i < n; i++) {
            currentTime += files[i];
            totalRetrievalTime += currentTime;

            System.out.print(files[i] + " ");
        }

        double averageRetrievalTime =
                (double) totalRetrievalTime / n;

        System.out.println("\n\nTotal Retrieval Time: " + totalRetrievalTime);
        System.out.println("Average Retrieval Time: " + averageRetrievalTime);

        sc.close();
    }
}
