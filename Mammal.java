package com.codingdojo.projectone;

public class Mammal {
		private int energyLvl;
		//Set the mammals energy to 100.
		public Mammal() {
			energyLvl = 100;
		}
		//Show what level the energy is at.
		public void displayEnergy() {
			System.out.println(energyLvl);
		}
		//This should add or subtract the points when necessary.
		public void setEnergy(int points) {
				energyLvl+=points;
		}
}
