public class ClassArrayMain 
{
	public static void main(String[] arg)
	{
		ClassArray ca = new ClassArray();
		int arr1[]  = {1,2,3,4,5,6,7,8,9};

		System.out.println("The Original Array :");
		for (int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		arr1= ca.reverseArray(arr1);
		System.out.println("The Reverse Array :");
		for (int i=0; i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}
	
}
