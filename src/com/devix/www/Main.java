package com.devix.www;


public class Main {

    public static void main(String[] args) {
        int volume = getVolume(2);
        System.out.println(volume);
    }

    private static int getVolume(int i) {
        return cube(i);
    }

    private static int cube(int i) {
        return (int) Math.pow(i, 3);
    }
}
