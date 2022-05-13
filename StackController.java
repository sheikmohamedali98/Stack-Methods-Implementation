package StackImplementation;
import java.util.Arrays;

import StackImplementation.StackMethods;


public class StackController {

	public static void main(String[] args) {
		StackMethods stm = new StackMethods();
		
		System.out.println("Stack Is Empty : "+stm.myEmpty());
		stm.myPush(10);
		stm.myPush(20);
		stm.myPush(30);
		stm.myPush(50);
		System.out.println("Peeked : "+stm.myPeeek());
		System.out.println("Popped : "+stm.myPop());
		System.out.println("Peeked : "+stm.myPeeek());
		System.out.println("Size : "+stm.mySize());
		System.out.println("total capacity :"+stm.myCapacity());
		System.out.println("Remain capacity : "+stm.myRemainCapacity());
		System.out.println("Display :"+Arrays.toString(stm.display()));
		}
	}


