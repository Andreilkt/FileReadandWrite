package com.company;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

            List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

            int counter = 0;
            for (String name : names) {

                if (name.equals("Jo")) {
                    //counter++;
                    System.out.println(names);
                }
            }
             //output 3
        }

    }

