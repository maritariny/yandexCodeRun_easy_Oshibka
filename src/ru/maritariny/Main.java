package ru.maritariny;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        /*2
        50 1
        50 2 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int pA = 0;
        int servers[] = new int[n];
        for (int i = 0; i < n; i++) {
            String[] parts = reader.readLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            servers[i] = a * b ;
            pA += servers[i];
        }
        for (double el : servers) {
            System.out.printf("%.12f\n", (double) el/pA);
        }
        reader.close();
    }
}
