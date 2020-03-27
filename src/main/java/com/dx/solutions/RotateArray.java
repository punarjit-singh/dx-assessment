package com.dx.solutions;

import java.util.*;

public class RotateArray {

    public static void main(String[] args) {

        ArrayList<Integer> givenArray = new ArrayList<Integer>();
        givenArray.add(10);
        givenArray.add(15);
        givenArray.add(20);
        givenArray.add(25);
        givenArray.add(40);


        solution(givenArray, 10);


    }

    private static ArrayList<Integer> solution(ArrayList<Integer> A, int K) {

        System.out.println("Value Before Rotation: "+Arrays.toString(A.toArray()));
        Collections.rotate(A, 1);
        System.out.println("Value After Rotation: "+Arrays.toString(A.toArray()));
        return A;
    }

}
