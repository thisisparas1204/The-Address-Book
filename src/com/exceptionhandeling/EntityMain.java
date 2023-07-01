package com.exceptionhandeling;

import java.util.Stack;

public class EntityMain {
    public static void main(String[] args) {

        Entity entity = new Entity();
        try {
            double result = entity.getRadius(-3.4);
            System.out.println(result);
        } catch (NegativeRadiusException ne) {
            StackTraceElement[] stackTrace = ne.getStackTrace();
            for (StackTraceElement item : stackTrace) {
                System.out.println(item.toString());
            }
        }
    }
}