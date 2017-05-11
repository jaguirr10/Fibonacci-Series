// Juan Aguirre

import java.util.Scanner;


class Fibonacci

{  
 static int n1=0,n2=1,n3=0;    
 static void printFibonacci(int x){    
    if(x>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(x-1);    
     }    
 }    
 public static void main(String args[]){    
 
	 Scanner scan = new Scanner(System.in);
	 System.out.print("Enter a value: ");
	 int x=scan.nextInt();    
  System.out.print("The Fibonacci sequence of the number is: "+n1+" "+n2);//printing 0 and 1    
  printFibonacci( x-2);//n-2 because 2 numbers are already printed   
 }  
}  