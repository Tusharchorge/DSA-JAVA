// Java program for the above approach
import java.io.*;
import java.util.*;

class GFG{

// Function to find the non-multiples
// till k
public static int findNonMultiples(int[] arr, int n,
								int k)
{
	
	// Stores all unique multiples
	Set<Integer> multiples = new HashSet<Integer>();
	
	// Iterate the array
	for(int i = 0; i < n; ++i)
	{
		
		// For finding duplicates
		// only once
		if (!multiples.contains(arr[i])) 
		{
			
			// Inserting all multiples
			// into the set
			for(int j = 1; j <= k / arr[i]; j++)
			{
				multiples.add(arr[i] * j);
			}
		}
	}
	
	// Returning only the count of
	// numbers that are not divisible
	// by any of the array elements
	return k - multiples.size();
}

// Function to count the total values
// in the range [L, R]
public static int countValues(int[] arr, int N,
							int L, int R)
{
	
	// Count all values in the range
	// using exclusion principle
	return findNonMultiples(arr, N, R) - 
		findNonMultiples(arr, N, L - 1);
}

// Driver code
public static void First(String[] args)
{
	int[] arr = { 2, 3, 4, 5, 6 };
	int N = arr.length;
	int L = 1;
	int R = 20;

	// Function Call
	System.out.println(countValues(arr, N, L, R));
}
}

// This code is contributed by rohitsingh07052


        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
         





         
    
 











// import java.util.*;
// public class First{
//     public static void main(String[]args) {
        
//         //making a calculator//
//         //we can take 3 variables/inputs a,b,operator from user//
    
//         Scanner input=new Scanner(System.in);
//         System.out.println("Enter first number");
//          double a=input.nextDouble();
//          System.out.println("Enter second number");
//          double b=input.nextDouble();
//          System.out.println("Enter operator");
//         char operator=input.next().charAt(0 );

//         switch (operator){
//         case '+':
//         System.out.println(a+b);
//         break;
//         case '-':
//         System.out.println(a-b);
//         break;
//         case '*':
//         System.out.println(a*b);
//         break;
//         case '%':
//         System.out.println(a%b);
//         break;
//         default:


//         }
//         }
                
//         }
        
    

        

