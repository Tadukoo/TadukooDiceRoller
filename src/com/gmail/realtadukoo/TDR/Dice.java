package com.gmail.realtadukoo.TDR;

import java.util.Random;
import java.util.Scanner;

public class Dice{
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("How many dice? ");
		
		int dice = keyboard.nextInt();
		
		while(dice != -1){
			int total = 0;
			int[] count = new int[6];
			int chain6 = 0;
			int maxChain6 = 0;
			
			for(int i = 0; i < dice; i++){
				int roll = rand.nextInt(6) + 1;
				if(i == dice - 1){
					System.out.print(roll + "\n");
				}else{
					System.out.print(roll + ", ");
				}
				count[roll-1]++;
				total += roll;
				if(roll == 6){
					chain6++;
					if(chain6 > maxChain6){
						maxChain6 = chain6;
					}
				}else{
					chain6 = 0;
				}
			}
			
			for(int i = 0; i < 6; i++){
				System.out.println((i+1) + ": " + count[i]);
			}
			System.out.println("Total: " + total);
			System.out.println("Longest chain of 6: " + maxChain6);
			
			System.out.print("How many dice? ");
			dice = keyboard.nextInt();
		}
		
		keyboard.close();
	}
}
