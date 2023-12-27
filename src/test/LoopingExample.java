package test;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//print all the numbers from 1 to 100
		//while loop
		
		int num1=1;
		
		while(num1<=100) {
			System.out.println(num1);
			num1=num1+1;
			
		}
		System.out.println("**************************************");
		//print all the numbers from 10 to 1
		//while loop
		
		int num2=10;
		
		while(num2>=1) {
			System.out.println(num2);
			
			num2=num2-1;
			
		}
		
		System.out.println("**************************************");
		
		//for loop
		
		for(int num3 = 1;num3<=10; num3++){
			
			System.out.println(num3);
			
		}
		System.out.println("**************************************");
		//Find even numbers between 1 to 10
		
		int num4=2;
		
		while(num4<=10) {
			
			System.out.println(num4);
			num4= num4+2;
			
		}
		System.out.println("**************************************");
		//Find even numbers between 1 to 50 by using for loop
		
		for(int num5=2;num5<=50;num5+=2) //num5+=2 means num5= num5+2
		{
			
			System.out.println(num5);
			
		}
		
		//For each loop
		
		System.out.println("For Each Loop**********");
		//for each loop
		
		
		int[] arr1 = {500,49,28,19,49};
		
		int sum = 0;
		
		
		for (int value:arr1) {
			System.out.println(value);
			sum+=value;
			
		}
		System.out.println("Sum is " +sum);
	}
	

}
