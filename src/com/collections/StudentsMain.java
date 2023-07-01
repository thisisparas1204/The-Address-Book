package com.collections;

import java.util.*;

public class StudentsMain {
    public static void main(String[] args) {
        Students s1 = new Students("Alex", 1);
        Students s2 = new Students("John", 2);
        Students s3 = new Students("Alex", 3);
        Students s4 = new Students("Robert", 4);
        Students s5 = new Students("Dino", 5);


        List<Students> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);



    }
}
