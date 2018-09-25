package com.codility.test.animal.impl;

import com.codility.test.animal.Animal;

public class Parrot extends Bird {

	private Animal nearOrLivesWith;

	public Parrot() {

	}

	@Override
	public String sing() {
		if (nearOrLivesWith == null) {
			return "Parrot,sing";
		} else if (nearOrLivesWith instanceof Dog) {
			return "Woof, woof";
		} else if (nearOrLivesWith instanceof Cat) {
			return "Meow";
		} else if (nearOrLivesWith instanceof Rooster) {
			return "Cock-a-doodle-doo";
		}

		return "";
	}

	public void setLivesWith(Animal animal) {
		this.nearOrLivesWith = animal;

	}

}
