package com.codingdojo.projectone;

class Gorilla extends Mammal {
	
	public Gorilla(){
		System.out.println("Me Terk, Me fat Gorilla! Me have 100 energy! ");
		displayEnergy();
	}
	
	public void throwSomething() { 
		setEnergy(-5);
		System.out.println("I throw! -5 energy!");
		displayEnergy();
	}
	
	public void eatBananas() {
		setEnergy(+10);
		System.out.println("Me hungry, me eat banana! +10 energy!");
		displayEnergy();
	}
	
	public void climb() {
		setEnergy(-10);
		System.out.println("TALL TREE? ME CLIMB!! -10 energy!");
		displayEnergy();
	}
}
