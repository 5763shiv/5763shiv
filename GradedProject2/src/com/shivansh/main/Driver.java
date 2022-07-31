package com.shivansh.main;

import java.util.Scanner;

import com.shivansh.service.Service;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfFloors;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println("enter the total no of floors in the building ");
	      numberOfFloors = sc.nextInt();
	      
	      Service floors = new Service();
	      int[] floorSizeArray = new int[numberOfFloors];
	      for(int i=0; i<numberOfFloors; i++) {
	    	  System.out.println("enter the floor size given on day " +(i+1)+ ":");
	    	  floorSizeArray[i] = sc.nextInt();
	      }
	      floors.orderedconst(numberOfFloors , floorSizeArray);
	      sc.close();
		}
		
	}

