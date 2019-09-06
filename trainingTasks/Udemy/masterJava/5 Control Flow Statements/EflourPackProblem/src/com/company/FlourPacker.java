package com.company;

public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int value = (bigCount * 5) + smallCount;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if (value >= goal) {
            for (int i = goal; i > 0; i -= 5) {
                if (goal < 5) {
                    break;
                }
                goal -= 5;
            }
            if (goal <= smallCount) {
                return true;
            }
            return false;
        }
        return false;
    }
}
