package practize29;

import java.util.Scanner;

public class RoadPosmotrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] graph = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
                if (i != j && graph[i][j] == 0) {
                    graph[i][j] = Integer.MAX_VALUE / 2;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][k] + graph[k][j] < graph[i][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (graph[i][j] >= Integer.MAX_VALUE / 2) {
                    System.out.print("0 ");
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
