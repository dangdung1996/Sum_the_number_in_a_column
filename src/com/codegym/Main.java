 package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[][] arr = new double[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Hàng " + (i + 1) + " cột " + (j+1));
                arr[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Tính tổng cột mấy ?");

        int choice = sc.nextInt();

        double sum = 0.0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (choice == 1) {
                    sum += arr[i][0];
                    break;
                } else if (choice == 2) {
                    sum += arr[i][1];
                    break;
                } else if(choice == 3) {
                    sum += arr[i][2];
                    break;
                }
            }
        }
        System.out.println("tong cot "+choice+" la:"+sum);
    }
}
