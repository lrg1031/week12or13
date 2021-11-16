package com.mycompany.inclassproblemweek12;

public class NewClass {
    
    public int getGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a-b;
            } else {
                b = b-a;
            }
        }
        return a;
    }
    
    public static int getSum(int... ints) {
        int answer = 0;
        for(int i=0;i<ints.length;i++) {
            answer = answer + ints[i];
        }
        return answer;
    }
    
    public static void main(String[] args) {
        System.out.println(" "+ getSum(3,4,5,7));
    }
    
}
