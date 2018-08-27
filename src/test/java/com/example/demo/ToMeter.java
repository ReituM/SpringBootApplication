package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToMeter {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.toMeter(500);
		assertEquals(5, output);
	}

}
