import java.util.*;
public class BFSgraphtraversal {
    public static void main(String[] args) {

        int[][] graph = {
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };

        int vertices = graph.length;
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        int start = 0; // Starting vertex A

        visited[start] = true;
        queue.add(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int i = 0; i < vertices; i++) {

                if (graph[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
