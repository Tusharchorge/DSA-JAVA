// Java program for the above approach
import java.io.*;
import java.util.*;

public class arr1{

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
public static void main(String[] args)
{
	int[] arr = {5,5,5 };
	int N = arr.length;
	int L = 5;
	int R = 5;

	// Function Call
	System.out.println(countValues(arr, N, L, R));
}
}

// This code is contributed by rohitsingh07052
