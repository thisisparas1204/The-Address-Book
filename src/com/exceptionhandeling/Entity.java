package com.exceptionhandeling;

public class Entity {
    public double getRadius (double radius) throws NegativeRadiusException {
        if (radius < 0)
            throw new NegativeRadiusException();
        return Math.PI * radius * radius;
    }
}
