package xpath;

import java.util.ArrayList;
import java.util.TreeSet;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inputArray[] = {4,6,7,3,4,5,6,6,3,2,1,1,0,3,2,5,8,9,6,7,8,9};
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		for(int i=0; i < inputArray.length; i++)
		{ 
			int counter;
			counter=0;
			if(!outputList.contains(inputArray[i]))
			{
				counter++;
				outputList.add(inputArray[i]);
				
				for(int j=i+1; j < inputArray.length; j++)
				{
					if( inputArray[j] == inputArray[i])
					{
						counter++;
					}
				}
				if(counter==1)
					System.out.println(inputArray[i]);
			}
		}
	}
}
