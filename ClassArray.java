
public class ClassArray 
{
	int arr[];
	int[] reverseArray(int[] fArr)
	{
		arr =new int[fArr.length];
		for (int i=fArr.length-1,j=0;i>=0;i--,j++)
		{
			arr[j]=fArr[i];
		}
		return arr;
	}
}



