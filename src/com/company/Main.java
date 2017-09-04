package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Random r = new Random();
	int [][] square = new int[5][5];
	for(int i = 1; i < square.length; i++){
	    for(int j = 0; j < square[i].length-1; j++){
	        square[i-1][j] = r.nextInt(11)-5;
        }
    }
    for(int i = 0; i < square.length-1; i++){
	    System.out.print("[");
	    for(int j = 0; j < square[i].length; j++){
	        System.out.print(square[i][j] + " ");
        }
        System.out.print("]");
        int min = square[i][0];
        int max = square[i][0];
        for(int j = 0; j < square[i].length; j++){
	        if(min > square[i][j]){ min = square[i][j];}
	        else if(max < square[i][j]){ max = square[i][j];}
        }
        System.out.print("["+ min + "," + max +"]");
        System.out.println();
        }
    }
}
