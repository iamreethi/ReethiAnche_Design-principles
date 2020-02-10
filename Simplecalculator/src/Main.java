import java.util.Scanner;
import java.io.*;
public class Main {
	public static void main(String args[])
	{   float num1 = 0;
	    float num2 = 0;
		Calculator calc = new Calculator();
		System.out.println("--------------------");
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("--------------------");
		System.out.println("AVAILABLE OPERATIONS");
	        System.out.println("1.ADDITION(+)");
	        System.out.println("2.SUBTRACTION(-)");
	        System.out.println("3.MULTIPLICATION(*)");
	        System.out.println("4.DIVISION(/)");
	        System.out.println("5.EXIT");
	  
         while(true) {
	    	  try {
	    	     System.out.println("SELECT AN OPTION(1-5)");
	    	     Scanner sc= new Scanner(System.in);
	        
	    	     switch(sc.nextInt())
	    	     {
	    	       case 1:
	    		         System.out.println("please enter first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("please enter second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("sum of "+(int)num1+" + "+(int)num2+" = "+(calc.sum(num1,num2)));
	    		         break;
	    	       case 2:
	    		         System.out.println("please enter first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("please enter second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("difference of "+(int)num1+" - "+(int)num2+" = "+(calc.difference(num1,num2)));
	    	             break;
	    	       case 3:
	    	
	    		         System.out.println("please enter first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("please enter second number:");
	    		         num2=sc.nextFloat(); 
	    		         System.out.println("multiplication  of "+(int)num1+" * "+(int)num2+" = "+(calc.multiplication(num1,num2)));
	    		         break;
	    	       case 4:
	    		         System.out.println("please enter first number:");
	    		         num1=sc.nextFloat();
	    		         System.out.println("please enter second number:");
	    		         num2=sc.nextFloat();
	    		         if(num2==0)
	    		           {
	    			         System.out.println("can't divide by 0");
	    			         break;
	    		           }
	    		         System.out.println("division of "+(int)num1+" / "+(int)num2+" = "+(calc.division(num1,num2)));
	    		         break;
	    	       case 5:
	    		   System.exit(1);
	    		  
	    		  
	    	       default:
	    		          System.out.println("please choose from given options(1-4)");
	    		          break;
	    	     }
	        }
	    	catch(Exception e){
	    		
	    		System.out.println("please enter valid input ");
	    		
	    	}
	}
	

}
}