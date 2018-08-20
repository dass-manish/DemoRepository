/**
 * 
 */
package com.test.impl;

import com.test.interfaces.BirdInterface;

/**
 * @author mdass-a
 *
 */
public class Sparrow implements BirdInterface {

	@Override
	public void makeSound() {
		System.out.println("Sparrow making sound..");
		
	}

	@Override
	public void fly() {
		System.out.println("Sparrow flying..");
		
	}
}
