package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        a = sort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }


    public static int[] sort(int a[]) {
        boolean isSame = true;
        double avg = 0;
        for (int i = 0; i < a.length; i++) {
            avg += a[i];
        }
        avg /= a.length;

        int b[] = new int[a.length];
        int start = 0;
        int end = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != a[0]) isSame = false;
            if (a[i] <= avg) {
                b[start] = a[i];
                start++;
            } else {
                b[end] = a[i];
                end--;

            }
        }
        if(isSame) return a;
        if (a.length > 2) {
            if (start != 0) {
                int left[] = sort(Arrays.copyOf(b, start));
                left = sort(left);
                for (int i = 0; i < b.length; i++) {
                    if (i < start) {
                        b[i] = left[i];
                    }
                }
            }
            if (b.length - start != 0) {
                int right[] = new int[b.length - start];
                for (int i = 0; i < b.length - start; i++) {
                    right[i] = b[start + i];
                }
                right = sort(right);
                for (int i = 0; i < b.length; i++) {
                    if (i < start) {
                    } else {
                        b[i] = right[i - start];
                    }
                }
            }
        }

        return b;
    }


}
