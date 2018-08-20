package com.test.interfaces;

import com.test.adapter.AdapterClass;
import com.test.impl.Duck;
import com.test.impl.Sparrow;

public class MainClass {

	public static void main (String [] args) {
		Sparrow s= new Sparrow();
		Duck duck= new Duck();
		AdapterClass adapterClass= new AdapterClass(s);
		adapterClass.squeak();
		duck.squeak();
	}
}
