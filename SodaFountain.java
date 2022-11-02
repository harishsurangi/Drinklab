package com.drink.different.drinking;

import java.util.Scanner;



public class SodaFountain {
	static Scanner scanner = new Scanner(System.in);
    private int water;
    private int  co2;
    private int  matchedsubstance;
    private int disposableCups;
	
	
	public SodaFountain(int water, int co2, int matchedsubstance, int disposableCups) {
		this.water = water;
		this.co2 = co2;
		this.matchedsubstance = matchedsubstance;
		this.disposableCups = disposableCups;
	}
	
	
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getCo2() {
		return co2;
	}
	public void setCo2(int co2) {
		this.co2 = co2;
	}
	public int getMatchedsubstance() {
		return matchedsubstance;
	}
	public void setMatchedsubstance(int matchedsubstance) {
		this.matchedsubstance = matchedsubstance;
	}
	public int getDisposableCups() {
		return disposableCups;
	}
	public void setDisposableCups(int disposableCups) {
		this.disposableCups = disposableCups;
	}
	
	 public static void showSupply(SodaFountain sodafountain){
	        System.out.println("The soda fountain has:");
	        System.out.println(sodafountain.getWater() + " of water");
	        System.out.println(sodafountain.getCo2() + " 1L of co2");
	        System.out.println(sodafountain.getMatchedsubstance()+ " remaining powder");
	        System.out.println(sodafountain.getDisposableCups() + " of disposable cups");
	    }
	 public static void buy(SodaFountain sodafountain ){
	        System.out.println("What do you want to get alias buy? 1 - CocoCola, 2 - Pepsi,3-Sprite, 4 - ThumpsUp, 5-MountainDew,6-Stringz, 7- back - to main menu");
	        String inputValue = scanner.nextLine();

	        switch(inputValue){
	            case "1" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new CocaCola()));
	                break;
	            case "2" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new Pepsi()));
	                break;
	            case "3" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new Sprite()));
	                break;
	            case "4" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new ThumpsUp()));
	                break;
	            case "5" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new MountainDew()));
	                break;
	            case "6" :
	                System.out.println(checkWhatIsNotEnough(sodafountain, new  StringZ()));
	                break;
	            case "back": break;
	        }
	       
	       
		    
	    }

	private static String checkWhatIsNotEnough(SodaFountain sodafountain, Soda soda) {
	 if(sodafountain.getWater() < soda.getWater()){
         return "Sorry, not enough water!";
     }else if(sodafountain.getCo2() < soda.getCo2()){
         return "Sorry, not enough Co2!";
     }else if(sodafountain.getMatchedsubstance()<soda.getMatchedsubstance()){
         return "Sorry, not enough substance";
     }else if(sodafountain.getDisposableCups() < 1){
         return "Sorry, not enough disposable cups";
     }else {
    	 sodafountain.setWater(sodafountain.getWater() - soda.getWater());
    	 sodafountain.setCo2(sodafountain.getCo2() - soda.getCo2());
    	 sodafountain.setMatchedsubstance(sodafountain.getMatchedsubstance() - soda.getMatchedsubstance());
    	 sodafountain.setDisposableCups(sodafountain.getDisposableCups() - 1);
        
         return "I have enough resources, making you a awesome Drink!";
     }
 }
	
	
	
	 public static void fill(SodaFountain sodafountain){
	        System.out.println(" ml of water do you want to add: ");
	        sodafountain.setWater(scanner.nextInt() + sodafountain.getWater());
	        System.out.println(" ml ofco2do you want to add: ");
	        sodafountain.setCo2(scanner.nextInt() +  sodafountain.getCo2());
	        System.out.println(" grams of matched substance do you want to add: ");
	        sodafountain.setMatchedsubstance(scanner.nextInt() + sodafountain. getMatchedsubstance());
	        System.out.println(" disposable cups you want to add: ");
	        sodafountain.setDisposableCups(scanner.nextInt() +  sodafountain.getDisposableCups());

	    }

}
