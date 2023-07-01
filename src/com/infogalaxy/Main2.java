package com.infogalaxy;

class Main2 {
    public static void main(String[] args) {
        int[] data = new int[]{10, 20, 30};
        try {
            int a = data[4];
            int b = a / 5;
            System.out.println("B: " + b);
            System.exit(0);
        }
        catch (ArrayIndexOutOfBoundsException ae ) {
            System.out.println("Exception: " + ae.getMessage());
        }
    }
}
