package com.company;

import java.util.Arrays;
import java.util.List;

public class FilterName {

    public static void main(String[] args) throws Exception{

        List<String> names = Arrays.asList("/src/com/company/test.txt");

        for (String name : names) {
            if (name != null && !name.isEmpty() && name.contains("  сценарий")) {
                System.out.println(name);
            }
        }
    }
}
