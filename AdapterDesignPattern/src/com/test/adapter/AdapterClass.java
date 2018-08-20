package com.test.adapter;

import com.test.interfaces.BirdInterface;
import com.test.interfaces.DuckInterface;

public class AdapterClass implements DuckInterface {

	BirdInterface bird;
	
	public AdapterClass(BirdInterface bird) {
		super();
		this.bird = bird;
	}

	@Override
	public void squeak() {
		bird.makeSound();
		
	}
}