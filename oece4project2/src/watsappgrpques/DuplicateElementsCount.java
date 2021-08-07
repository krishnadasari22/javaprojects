package watsappgrpques;

//Java Implementation to find the
//repeating elements with there count
import java.util.*;

class DuplicateElementsCount
{
	
//Function to find the repeating
//elements with there count
static HashMap<Integer, Integer> findRepeating(int []arr, int size){
	
	// Hash map to store the
	// frequency of elements
	HashMap<Integer,Integer> frequency = new HashMap<Integer,Integer>();
	
	// Loop to store the frequency of
	// elements of array
	for(int i = 0; i < size; i++)
	{
		if(frequency.containsKey(arr[i]))
		{
			frequency.put(arr[i], frequency.get(arr[i]) + 1);
		}
		else
		{
			frequency.put(arr[i], 1);
		}
	}
	return frequency;
}

//Driver Code
public static void main(String []args)
{
	int []arr = {4, 4, 5, 5, 6};
	int arr_size = arr.length;
	HashMap<Integer,Integer> frequency = findRepeating(arr, arr_size);
	System.out.println("Below is the frequency"
	+"of repeated elements -");
	for (Map.Entry<Integer,Integer> entry : frequency.entrySet())
		if (entry.getValue() > 1)
			System.out.println(entry.getKey()+ " --> "+entry.getValue());
}
}

