package com.java.features;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Var {
    public static void main(String[] args) throws IOException {

        var reader = new InputStreamReader(System.in);
        var bufferedReader = new BufferedReader(reader);
        var aList = new ArrayList<>();

        var a = 9;
        var n = "String";

//        Old way
        /*
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);
        ArrayList<String> aList = new ArrayList<>();
         */
        aList.add(bufferedReader.readLine());
        aList.add(bufferedReader.readLine());

        System.out.println(aList);

    }
}
