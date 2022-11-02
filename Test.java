package com.drink.different.drinking;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

		 SodaFountain con = new SodaFountain(400, 550, 120, 2);

	        boolean exit = false;
	        String inputValue = "";
	        while(!exit){
	            System.out.println("action (buy, fill,  remaining, exit)");
	            inputValue = scanner.nextLine();

	            if(inputValue.equals("buy")){
	            	SodaFountain.buy(con);
	            }else if(inputValue.equals("fill")){
	            	SodaFountain.fill(con);
	            
	            }else if(inputValue.equals("remaining")){
	            	SodaFountain.showSupply(con);
	            }else if(inputValue.equals("exit")){
	                exit = true;
	            }
	        }
	    }
	}


