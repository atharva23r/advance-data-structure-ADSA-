public class dijkstraAlgo {

    static int INF = 9999;

    public static int[] dijkstra(int[][] graph, int source) {

        int n = graph.length;

        int[] distance = new int[n];
        boolean[] visited = new boolean[n];

        // Initialize distances
        for (int i = 0; i < n; i++) {
            distance[i] = INF;
            visited[i] = false;
        }

        distance[source] = 0;

        for (int i = 0; i < n; i++) {

            // Find minimum distance vertex
            int u = -1;
            int minimum = INF;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && distance[j] < minimum) {
                    minimum = distance[j];
                    u = j;
                }
            }

            if (u == -1) {
                break;
            }

            visited[u] = true;

            // Update distances
            for (int v = 0; v < n; v++) {

                if (!visited[v] &&
                    graph[u][v] != 0 &&
                    distance[u] + graph[u][v] < distance[v]) {

                    distance[v] = distance[u] + graph[u][v];
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {

        // Graph
        int[][] graph = {
            {0, 4, 1, 0},
            {4, 0, 2, 5},
            {1, 2, 0, 8},
            {0, 5, 8, 0}
        };

        int source = 0;

        int[] answer = dijkstra(graph, source);

        System.out.print("Shortest distances: ");

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == INF) {
                System.out.print("INF ");
            } else {
                System.out.print(answer[i] + " ");
            }
        }
    }
}