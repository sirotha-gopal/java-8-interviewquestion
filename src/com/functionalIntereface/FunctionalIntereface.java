package com.functionalIntereface;

import java.util.ArrayList;
import java.util.List;

interface MyInterface {
	
	void actractFun(int x,int y);

    @Override
    public String toString(); //Overridden from Object class
 
    @Override
    public boolean equals(Object obj); //Overridden from Object class

	
}

class AB {
	
	public static void main(String args[]) {
		
		MyInterface obj = (int x, int y) -> System.out.println(x+y);
		obj.actractFun(0,0);
		System.out.println(obj.toString());
		
//		===== forEach() method==================
		 List<String> subList = new ArrayList<String>();
	        subList.add("Carrot");
	        subList.add("Potato");
	        subList.add("Cauliflower");
	        subList.add("LadyFinger");
	        subList.add("Tomato");
	        System.out.println("------------Vegetable List--------------");
	        subList.forEach(s -> System.out.println(s.concat("Fruti")));
	        Math.random();
	}

}
