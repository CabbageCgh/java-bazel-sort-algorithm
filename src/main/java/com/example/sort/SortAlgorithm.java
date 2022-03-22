package com.example.sort;

import com.google.common.base.Joiner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortAlgorithm {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the string to be sorted, for example：g,d,e,z,a,b");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputArray = reader.readLine();

        SortAlgorithm sort = new SortAlgorithm();

        boolean verifyState = sort.verifyInputLine(inputArray);
        if (verifyState) {
            String[] sortArrays = sort.sort(inputArray.trim().split(","));
            String sortStrings = Joiner.on(",").join(sortArrays);
            System.out.println(sortStrings);
        }
    }

    public boolean verifyInputLine(String inputArray) {
        if (inputArray == null || inputArray.trim().length() == 0) {
            System.out.println("please entry the correct string");
            return false;
        }
        return true;
    }

    public String[] sort(String[] randomArrays) {
        for(int i = 0; i < randomArrays.length; i ++) {
            for(int j = i; j < randomArrays.length; j ++) {
                String a = randomArrays[i];
                String b = randomArrays[j];

                int compareInt = a.compareTo(b);

                if (compareInt > 0) {
                    randomArrays[i] = b;
                    randomArrays[j] = a;
                }
            }
        }
        return randomArrays;
    }
}
