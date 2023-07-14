package com.epam.loops;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int width = cathetusLength * 2 - 1;

        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j < width; j++) {
                if (j < cathetusLength) {
                    if (j >= cathetusLength - i - 1) {
                        System.out.print(cathetusLength - j);
                    } else {
                        System.out.print(" ");
                    }
                } else if (j >= cathetusLength && (j < width + 1 - cathetusLength + i)) {
                    System.out.print(j - cathetusLength + 2);
                } else {

                }
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }
}
