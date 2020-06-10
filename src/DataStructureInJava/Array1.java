package DataStructureInJava;

public class Array1 {

	public static void main(String[] args) {
		
		//we need to specify the size of array while creating, its not dynamic
		//we cant change size of an array once created
		int[] intArray = new int[7];

		intArray[0] = 21;
		intArray[1] = 22;
		intArray[2] = 23;
		intArray[3] = 24;
		intArray[4] = 25;
		intArray[5] = 26;
		intArray[6] = 7;
		
	
		System.out.println("if use syso it just print type of element and hashcode "+intArray);
		
		System.out.println("thats why we use loop to iterate throgh array");
		for(int i=0;i< intArray.length;i++)
		{
			System.out.println(intArray[i]);
		}
		
		
		int index = -1;
		for(int i=0;i< intArray.length;i++)
		{
		if(intArray[i]==7)
		{
			index = i;
			break;
			
		}
		
		}
		
		
		System.out.println("index of 7 is "+index);
	}

}
