package com.codingdojo.projectone;

class Bat extends Mammal {
	public Bat(){
		setEnergy(200);
		System.out.println("....I'M BATMAN......300 POINTS!");
		displayEnergy();
	}
	
	public void fly() { 
		setEnergy(-50);
		System.out.println("A VILLAIN? NOT SO FAST! ==FLIES OFF== -50 POINTS!");
		displayEnergy();
	}
	
	public void eatHumans() {
		setEnergy(+25);
		System.out.println("STOP RIGHT THERE HUMAN VILLAIN! I SHALL DEVOUR YOU FOR YOUR CRIMES! +25 POINTS!");
		displayEnergy();
	}
	
	public void attackTown() {
		setEnergy(-100);
		System.out.println("I MUST DESTROY GOTHAM BEFORE THE VILLAINS DO! -100 POINTS!");
		displayEnergy();
	}
}
