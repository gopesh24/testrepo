package org.gopi.test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int size = arr.length;
        int positive = 0;
        int negative = 0;
        int zero = 0;
        Arrays.stream(arr).forEach(t -> {
          //  if(t > 0 ){ positive++;}else if(t < 0){negative++;}else{zero++;}
          System.out.println(t) ;
        });
            List<Integer> abc = new ArrayList<Integer>();
            abc.add(positive);
            abc.add(negative);
            abc.add(zero);
       // Stream.of(positive,negative,zero).forEach(r -> System.out.println(r/size));
        abc.stream().forEach(ele -> System.out.println(ele/size) );
        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
