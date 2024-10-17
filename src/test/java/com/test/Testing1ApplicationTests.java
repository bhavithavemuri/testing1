package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Testing1ApplicationTests {

	@Test
	public void additiontest()
	{
		assertEquals(20,Calculator.add(10,10));
	}
	public void subtractiontest()
	{
		assertEquals(10,Calculator.sub(20,10));
	}
	public void multiplicationtest()
	{
		assertEquals(10,Calculator.mul(2,5));
	}
	public void divisiontest()
	{
		assertEquals(10,Calculator.div(20,2));
		
	}

}
