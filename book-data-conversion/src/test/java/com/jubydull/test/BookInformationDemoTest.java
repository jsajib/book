package com.jubydull.test;

import org.junit.Test;

import com.jubydull.bookinformation.demo.BookInformationDemo;

public class BookInformationDemoTest {
	
	@Test
	public void fileFormatTest(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] = {};
		demo.main(fileName);
	}
	
	@Test
	public void fileFormatTest1(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] = {"bookinformation.json"};
		demo.main(fileName);
	}
	
	@Test
	public void fileFormatTest2(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] = {"bookinformation.txt"};
		demo.main(fileName);
	}
	
	@Test
	public void fileFormatTest4(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] = null;
		demo.main(fileName);
	}
	
	@Test
	public void fileFormatTest5(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] =  {"bookinformation.jpg"};;
		demo.main(fileName);
	}
	
	@Test
	public void fileFormatTest6(){
		BookInformationDemo demo = new BookInformationDemo();
		String fileName[] =  {"bookinformations.txt"};;
		demo.main(fileName);
	}
}
